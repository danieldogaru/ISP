
public class Runway {
    private int number;
    private String position;
    private String condition;
    private boolean inUse;

    public Runway(int number, String position, String condition, boolean inUse) {
        this.number = number;
        this.position = position;
        this.condition = condition;
        this.inUse = inUse;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }
}
