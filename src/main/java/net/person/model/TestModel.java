package net.person.model;

/**
 * Created by admin on 2018/1/31.
 */
public class TestModel {
    public String testID;
    public String testName;
    public String testSex;
    public String testAge;
    public TestModel() {
        super();
    }
    public TestModel(String testID, String testName, String testSex, String testAge) {
        super();
        this.testID = testID;
        this.testName = testName;
        this.testSex = testSex;
        this.testAge = testAge;
    }
    public String getTestID() {
        return testID;
    }
    public void setTestID(String testID) {
        this.testID = testID;
    }
    public String getTestName() {
        return testName;
    }
    public void setTestName(String testName) {
        this.testName = testName;
    }
    public String getTestSex() {
        return testSex;
    }
    public void setTestSex(String testSex) {
        this.testSex = testSex;
    }
    public String getTestAge() {
        return testAge;
    }
    public void setTestAge(String testAge) {
        this.testAge = testAge;
    }
}