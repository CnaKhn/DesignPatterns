package State;

public class HasCard implements ATMState {
    ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Already card inserted.");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atmMachine.setAtmState(atmMachine.getNoCardState());
    }

    @Override
    public void insertPin(int pin) {
        if (pin == 1234) {
            System.out.println("Correct PIN.");
            atmMachine.correctPinEntered = true;
            atmMachine.setAtmState(atmMachine.getHasPin());
        } else {
            System.out.println("WRONG PIN");
            atmMachine.correctPinEntered = false;
            System.out.println("Card ejected.");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        }
    }

    @Override
    public void requestCash(int cash) {
        System.out.println("ENTER PIN FIRST!");
    }
}
