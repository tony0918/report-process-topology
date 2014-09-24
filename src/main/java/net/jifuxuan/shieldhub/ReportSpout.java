/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.jifuxuan.shieldhub;

import backtype.storm.spout.SpoutOutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichSpout;
import backtype.storm.tuple.Fields;
import backtype.storm.tuple.Values;
import backtype.storm.utils.Utils;
import java.util.Map;

/**
 *
 * @author tony
 */
public class ReportSpout extends BaseRichSpout {

    private SpoutOutputCollector collector;

    @Override
    public void declareOutputFields(OutputFieldsDeclarer ofd) {
        ofd.declare(new Fields("ReportRecord"));
    }

    @Override
    public void open(Map map, TopologyContext tc, SpoutOutputCollector soc) {
        this.collector = soc;
    }

    @Override
    public void nextTuple() {
        collector.emit(new Values("test"));
        Utils.sleep(1000);
    }

}
