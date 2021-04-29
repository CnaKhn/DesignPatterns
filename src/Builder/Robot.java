package Builder;

public class Robot implements RobotPlan {

    private String head, torso, arms, legs;

    public String getHead() {
        return head;
    }

    public String getTorso() {
        return torso;
    }

    public String getArms() {
        return arms;
    }

    public String getLegs() {
        return legs;
    }

    @Override
    public void setRobotHead(String head) {
        this.head = head;
    }

    @Override
    public void setRobotTorso(String torso) {
        this.torso = torso;
    }

    @Override
    public void setRobotArms(String arms) {
        this.arms = arms;
    }

    @Override
    public void setRobotLegs(String legs) {
        this.legs = legs;
    }
}
