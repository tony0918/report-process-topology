package net.jifuxuan.entities;

import java.util.Date;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;

@Entity("ReportRecord")
public class ReportRecord {

    private ObjectId id;
    private String projectName = "DefaultProject";
    private boolean testStatus = false;
    private Date createTime;
    private Date lastUpdateTime;
    private String changeList = "DefaultChangeList";
    private String testCaseName = "DefaultTestCase";
    private String category = "DefaultCategory";
    private String benchmark = "DefaultBenchmark";
    private double duration = 0;

    public ReportRecord(Date createTime, Date lastUpdateTime) {
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setTestStatus(boolean testStatus) {
        this.testStatus = testStatus;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public void setChangeList(String changeList) {
        this.changeList = changeList;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setBenchmark(String benchmark) {
        this.benchmark = benchmark;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public ObjectId getId() {
        return id;
    }

    public String getProjectName() {
        return projectName;
    }

    public boolean isTestStatus() {
        return testStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public String getChangeList() {
        return changeList;
    }

    public String getTestCaseName() {
        return testCaseName;
    }

    public String getCategory() {
        return category;
    }

    public String getBenchmark() {
        return benchmark;
    }

    public double getDuration() {
        return duration;
    }

}
