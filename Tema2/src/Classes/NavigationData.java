package Classes;

public class NavigationData {
    private int heading;
    private int speed;

    public NavigationData(int heading, int speed) {
        this.heading = heading;
        this.speed = speed;
    }

    public int getHeading() {

        return heading;
    }

    public void setHeading(int heading) {
        this.heading = heading;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
