package Adapter;

public class Main {
    public static void main(String[] args) {
        EnemyTank tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();

        EnemyRobotAdapter robotAdapter = new EnemyRobotAdapter(robot);
        System.out.println("The Robot");
        robot.reactToHuman("PAUL");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("The Enemy Tank");
        tank.assignDriver("FRAANK");
        tank.fireWeapon();
        tank.driveForward();

        System.out.println("The Robot with Adapter");
        robotAdapter.assignDriver("MARK");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
