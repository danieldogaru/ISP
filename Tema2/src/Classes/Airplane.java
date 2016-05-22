package Classes;

import java.util.Scanner;

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

    public boolean RequestLanding(Tower tower){
        if( status != "PendingLanding" && status != "GoneAround" ){
            tower.DenyLandingPermission(this);
            return false;
        }

        tower.GiveLandingPermission(this);
        return true;
    }

    public boolean RequestTakeOff(Tower tower){
        if( status != "PendingTakeoff" ){
            tower.DenyTakeOffPermission(this);
            return false;
        }

        tower.GiveTakeOffPermission(this);
        return true;
    }

    public void RequestDirections(){
        System.out.println("AIRPLANE: " + this.airplaneData.getCallSign());
        System.out.println("Heading: ");

        Scanner scan = new Scanner(System.in);
        int heading = scan.nextInt();

        System.out.println("Speed: ");
        int speed = scan.nextInt();

        this.setNavigationData(new NavigationData(heading, speed));
    }

    public boolean RequestTurnAround(){
        if( this.status == "LandingGranted" || this.status == "PendingLadning" ){
            this.status = "GoneAround";
            return true;
        }

        return false;
    }

    public Weather RequestWeatherData(){
        return new Weather(new Wind(20,30), "SUNNY", 1024, 300);
    }

    public void RequestEmergency(){
          if(this.status != "PendingTakeoff") {
              this.status = "EmergencyLanding" ;
          }
    }

    public void TakeOff(){
            this.status = "TakeoffExecuted"  ;
    }

    public void Land(){
             this.status = "Landing";
    }

    public void TurnAround(){
           this.status = "TurningAround";
    }

    public void EmergencyLanding(){
           this.status = "EmergencyLandingInProgress";
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
