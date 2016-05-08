
public class Control {
    private Ground ground;
    private Tower  tower;

    public Control(Ground ground, Tower tower) {
        this.ground = ground;
        this.tower = tower;
    }

    public Ground getGround() {

        return ground;
    }

    public void setGround(Ground ground) {
        this.ground = ground;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }
}
