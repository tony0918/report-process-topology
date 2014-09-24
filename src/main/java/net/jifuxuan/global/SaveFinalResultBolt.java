package net.jifuxuan.global;

import backtype.storm.task.OutputCollector;
import backtype.storm.task.TopologyContext;
import backtype.storm.topology.OutputFieldsDeclarer;
import backtype.storm.topology.base.BaseRichBolt;
import backtype.storm.tuple.Tuple;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.jifuxuan.entities.ReportRecord;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author tony
 */
public class SaveFinalResultBolt extends BaseRichBolt {

    private MongoClient mongoClient;
    private Morphia morphia;
    private Datastore datastore;

    @Override
    public void declareOutputFields(OutputFieldsDeclarer ofd) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void prepare(Map map, TopologyContext tc, OutputCollector oc) {
//        try {
//            this.mongoClient = new MongoClient("10.19.226.76");
//            this.morphia = new Morphia();
//            this.datastore = morphia.createDatastore(mongoClient, "ReportPortal");
//            System.out.println("10.19.226.76");
//        } catch (UnknownHostException ex) {
//            Logger.getLogger(SaveFinalResultBolt.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    @Override
    public void execute(Tuple tuple) {
//        Date date = new Date();
//        ReportRecord reportRecord = new ReportRecord(date, date);
//        datastore.save(reportRecord);
//        System.out.println(reportRecord.getId());
        System.out.println("12345");
    }

}
