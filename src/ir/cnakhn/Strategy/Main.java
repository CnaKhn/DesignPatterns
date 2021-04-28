package ir.cnakhn.Strategy;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog: " + dog.tryToFly());
        System.out.println("Bird: " + bird.tryToFly());

        dog.setFlyAbility(new CanFly());

        System.out.println("Dog: " + dog.tryToFly());
    }
}
