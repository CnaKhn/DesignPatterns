package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What type of Ship? U/R/B");

        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = enemyShipFactory.makeEnemyShip(typeOfShip);
        }

        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {

        }

    }

    private static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
