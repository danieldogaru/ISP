package Classes;

public class AirplaneData {
    private String callSign;
    private String flightType;
    private String model;
    private String departureID;
    private String destinationID;

    private int    numPassengers;

    public int getNumPassengers() {
        return numPassengers;
    }

    public AirplaneData(String callSign, String flightType, String model, String departureID, String destinationID, int numPassengers) {
        this.callSign = callSign;
        this.flightType = flightType;
        this.model = model;
        this.departureID = departureID;
        this.destinationID = destinationID;
        this.numPassengers = numPassengers;
    }

    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    public String getCallSign() {
        return callSign;
    }

    public void setCallSign(String callSign) {
        this.callSign = callSign;
    }

    public String getFlightType() {
        return flightType;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDepartureID() {
        return departureID;
    }

    public void setDepartureID(String departureID) {
        this.departureID = departureID;
    }

    public String getDestinationID() {
        return destinationID;
    }

    public void setDestinationID(String destinationID) {
        this.destinationID = destinationID;
    }
}
