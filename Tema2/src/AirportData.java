import java.util.Vector;

public class AirportData {
    private Vector<Runway> runways;
    private Weather weather;

    public AirportData(Vector<Runway> runways, Weather weather) {
        this.runways = runways;
        this.weather = weather;
    }

    public Vector<Runway> getRunways() {

        return runways;
    }

    public void setRunways(Vector<Runway> runways) {
        this.runways = runways;
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }
}
