package Classes;

import java.util.Vector;


public class Tower{
    private Vector<Person>   personal;
    private Vector<Airplane> airplanes;

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public  double frequency = 120.22;
    private int    numAirplanes;

    public Tower(Vector<Person> personal, Vector<Airplane> airplanes, double frequency) {
        this.personal = personal;
        this.airplanes = airplanes;
        this.numAirplanes = airplanes.size();
    }

    public Tower(){

    }

    public void AssignPerson(Person person, Airplane airplane){
         airplane.setAirportAsignee(person);
    }

    public void SendToGround(Airplane airplane){
        double f =  (new Tower()).frequency;
        airplane.setFrequency(f);
    }

    public void GiveTakeOffPermission(Airplane airplane){
        airplane.setStatus("TakeoffGranted");
    }

    public void GiveLandingPermission(Airplane airplane){
        airplane.setStatus("LandingGranted");
    }

    public void DenyTakeOffPermission(Airplane airplane){
        airplane.setStatus("TakeoffDenied");
    }

    public void DenyLandingPermission(Airplane airplane){
        airplane.setStatus("LandingDenied");
    }

    public Vector<Person> getPersonal() {
        return personal;
    }

    public void setPersonal(Vector<Person> personal) {
        this.personal = personal;
    }

    public Vector<Airplane> getAirplanes() {
        return airplanes;
    }

    public void setAirplanes(Vector<Airplane> airplanes) {
        this.airplanes = airplanes;
    }

    public int getNumAirplanes() {
        return numAirplanes;
    }

    public void setNumAirplanes(int numAirplanes) {
        this.numAirplanes = numAirplanes;
    }
}