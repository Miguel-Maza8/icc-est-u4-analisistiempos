package models;

public class Results {
    private double time;
    private String name;
    private int sample;
    
    public Results(double time, String name, int sample) {
        this.time = time;
        this.name = name;
        this.sample = sample;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSample() {
        return sample;
    }

    public void setSample(int sample) {
        this.sample = sample;
    }
    

}
