import java.util.Vector;
public class Ground {
    private Vector<Person>   personal;
    private Vector<Airplane> airplanes;
    private double frequency;
    private int    numAirplanes;

    public Ground(Vector<Person> personal, Vector<Airplane> airplanes, double frequency) {
        this.personal = personal;
        this.airplanes = airplanes;
        this.frequency = frequency;
        this.numAirplanes = airplanes.size();
    }

    public void AssignPerson(Person p, Airplane a){

    }

    public void SendToTower(Airplane a){

    }

    public boolean GivePermission(){
        return true;
    }

    public boolean DenyPermission(){
        return true;
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
