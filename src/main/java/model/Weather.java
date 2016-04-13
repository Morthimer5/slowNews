package model;

public class Weather {
    private int temperature;
    private String sky;

    public Weather() {
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public String getSky() {
        return sky;
    }

    public void setSky(String sky) {
        this.sky = sky;
    }

    public Weather(int temperature, String sky) {
        this.temperature = temperature;
        this.sky = sky;
    }
}
