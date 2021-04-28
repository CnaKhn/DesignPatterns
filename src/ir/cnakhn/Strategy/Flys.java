package ir.cnakhn.Strategy;

public interface Flys {
    String fly();
}

class CanFly implements Flys {
    @Override
    public String fly() {
        return "Flying High";
    }
}

class CantFly implements Flys {
    @Override
    public String fly() {
        return "Can't Fly";
    }
}
