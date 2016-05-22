package Classes;

public class Wind {
    private int direction;
    public int speed;

    public Wind(int direction, int speed) {
        this.direction = direction;
        this.speed = speed;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
