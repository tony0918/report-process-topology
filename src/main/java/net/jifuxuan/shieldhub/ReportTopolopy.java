/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jifuxuan.shieldhub;

import backtype.storm.Config;
import backtype.storm.LocalCluster;
import backtype.storm.StormSubmitter;
import backtype.storm.topology.TopologyBuilder;
import backtype.storm.utils.Utils;
import net.jifuxuan.global.SaveFinalResultBolt;

public class ReportTopolopy {

    public static void main(String[] args) throws Exception {

        TopologyBuilder builder = new TopologyBuilder();
        builder.setSpout("ShieldhubReportSpout", new ReportSpout(), 10);
        builder.setBolt("ShieldhubReportSaveFinalResultBolt", new SaveFinalResultBolt(), 2).shuffleGrouping("ShieldhubReportSpout");

        Config conf = new Config();
        conf.setDebug(true);

        if (args != null && args.length > 0) {
            conf.setNumWorkers(3);
            StormSubmitter.submitTopology(args[0], conf, builder.createTopology());
        } else {
            LocalCluster cluster = new LocalCluster();
            cluster.submitTopology("ShieldhubReportTopology", conf, builder.createTopology());
            Utils.sleep(10000);
            cluster.killTopology("ShieldhubReportTopology");
            cluster.shutdown();
        }
    }
}
