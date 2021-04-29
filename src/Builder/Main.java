package Builder;

public class Main {
    public static void main(String[] args) {
        RobotBuilder robotBuilder = new OldRobotBuilder();
        RobotEngineer robotEngineer = new RobotEngineer(robotBuilder);
        robotEngineer.makeRobot();

        Robot firstRobot = robotBuilder.getRobot();
        System.out.println(firstRobot.getHead());
        System.out.println(firstRobot.getTorso());
        System.out.println(firstRobot.getArms());
        System.out.println(firstRobot.getLegs());
    }
}
