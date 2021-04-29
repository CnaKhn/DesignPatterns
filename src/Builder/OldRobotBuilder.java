package Builder;

public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("ARMS");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("LEGS");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
