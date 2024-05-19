
package prototypeDesignPattern;

public class student{

    private String name;
    private int age;
    private double psp;
    private String batch;
    private double batchPsp;
    private double pspFraction;

    public double getPspFraction() {
        this.pspFraction = this.psp/this.batchPsp;
        return pspFraction;
    }
    public void setPspFraction(double pspFraction) {
        this.pspFraction = pspFraction;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public double getPsp() {
        return psp;
    }
    public void setPsp(int psp) {
        this.psp = psp;
    }
    public String getBatch() {
        return batch;
    }
    public void setBatch(String batch) {
        this.batch = batch;
    }
    public double getBatchPsp() {
        return batchPsp;
    }
    public void setBatchPsp(int batchPsp) {
        this.batchPsp = batchPsp;
    }


}