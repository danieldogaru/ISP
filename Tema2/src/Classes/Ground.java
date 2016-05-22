package Classes;

import java.util.Vector;
public class Ground {
    private Vector<Person>   personal;
    private Vector<Airplane> airplanes;
    public double frequency = 100.00;
    private int    numAirplanes;

    public Ground(Vector<Person> personal, Vector<Airplane> airplanes, double frequency) {
        this.personal = personal;
        this.airplanes = airplanes;
        this.frequency = frequency;
        this.numAirplanes = airplanes.size();
    }

    public Ground(){

    }

    public void AssignPerson(Person person, Airplane airplane){
        airplane.setAirportAsignee(person);
    }

    public void SendToTower(Airplane airplane){
          double f =  (new Tower()).frequency;
          airplane.setFrequency(f);
    }

    public void GiveTaxiPermission(Airplane airplane){
        airplane.setStatus("TaxiGranted");
    }
    public int getNumAirplanes() {

        return numAirplanes;
    }

    public void setNumAirplanes(int numAirplanes) {
        this.numAirplanes = numAirplanes;
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

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }
}
