
public class ATC {
    private AirportData airportData;
    private Control     control;

    public ATC(AirportData airportData, Control control) {
        this.airportData = airportData;
        this.control = control;
    }

    public AirportData getAirportData() {

        return airportData;
    }

    public void setAirportData(AirportData airportData) {
        this.airportData = airportData;
    }

    public Control getControl() {
        return control;
    }

    public void setControl(Control control) {
        this.control = control;
    }
}
