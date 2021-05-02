package Adapter;

import java.util.Random;

public class EnemyRobot {
    Random generator = new Random();

    public void smashWithHands() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Robot causes " + damage + " damage with his hands!");
    }

    public void walkForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Robot walks " + movement + " spaces.");
    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy Robot tramps on " + driverName);
    }
}
