package State;

public class NoCash implements ATMState {

    ATMMachine atmMachine;

    public NoCash(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("We Don't Have Money!");
    }

    @Override
    public void ejectCard() {
        System.out.println("We Don't Have Money!, You didn't enter a card.");
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("We Don't Have Money!");
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("We Don't Have Money!");
    }
}
