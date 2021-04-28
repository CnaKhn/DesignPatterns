package ir.cnakhn.Strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        setSound("Tweet");
        flys = new CanFly();
    }
}
