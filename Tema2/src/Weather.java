import java.security.PrivateKey;

public class Weather {
    private Wind wind;
    private double temperature;
    private int pressure;
    private String type;

    public Weather(Wind wind, String type, int pressure, double temperature) {
        this.wind = wind;
        this.type = type;
        this.pressure = pressure;
        this.temperature = temperature;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
