import java.util.Vector;
public class Tower{
    private Vector<Person>   personal;
    private Vector<Airplane> airplanes;
    private double frequency;
    private int    numAirplanes;

    public Tower(Vector<Person> personal, Vector<Airplane> airplanes, double frequency) {
        this.personal = personal;
        this.airplanes = airplanes;
        this.frequency = frequency;
        this.numAirplanes = airplanes.size();
    }

    public void AssignPerson(Person p, Airplane a){

    }

    public void SendToGround(Airplane a){

    }

    public boolean GivePermission(){
        return true;
    }

    public boolean DenyPermission(){
        return true;
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

    public int getNumAirplanes() {
        return numAirplanes;
    }

    public void setNumAirplanes(int numAirplanes) {
        this.numAirplanes = numAirplanes;
    }
}