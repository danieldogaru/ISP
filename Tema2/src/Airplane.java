
public class Airplane {
    private AirplaneData    airplaneData;
    private NavigationData  navigationData;
    private Person          pilot;
    private Person          airportAsignee;
    private String          status;
    private double          frequency;


    public Airplane(AirplaneData airplaneData, NavigationData navigationData, Person pilot, Person airportAsignee, String status, double frequency) {

        this.airplaneData = airplaneData;
        this.navigationData = navigationData;
        this.pilot = pilot;
        this.airportAsignee = airportAsignee;
        this.status = status;
        this.frequency = frequency;
    }

    public boolean RequestLanding(){
        return true;
    }

    public boolean RequestTakeOff(){
        return true;
    }

    public void ContactTower(){

    }

    public void ContactGround(){

    }

    public NavigationData RequestDirections(){
        return null;
    }

    public boolean RequestTurnAround(){
        return true;
    }

    public Weather RequestWeatherData(){
        return null;
    }

    public void RequestEmergency(){

    }

    public void TakeOff(){

    }

    public void Land(){

    }

    public void TurnAround(){

    }

    public void EmergencyLanding(){

    }

    public AirplaneData getAirplaneData() {
        return airplaneData;
    }

    public void setAirplaneData(AirplaneData airplaneData) {
        this.airplaneData = airplaneData;
    }

    public NavigationData getNavigationData() {
        return navigationData;
    }

    public void setNavigationData(NavigationData navigationData) {
        this.navigationData = navigationData;
    }

    public Person getPilot() {
        return pilot;
    }

    public void setPilot(Person pilot) {
        this.pilot = pilot;
    }

    public Person getAirportAsignee() {
        return airportAsignee;
    }

    public void setAirportAsignee(Person airportAsignee) {
        this.airportAsignee = airportAsignee;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

}
