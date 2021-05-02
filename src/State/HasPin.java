package State;

public class HasPin implements ATMState {

    ATMMachine atmMachine;

    public HasPin(ATMMachine atmMachine) {
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
        System.out.println("Already entered PIN.");
    }

    @Override
    public void requestCash(int cash) {
        if (cash > atmMachine.cashInMachine) {
            System.out.println("The Machine don't have enough cash.");

            System.out.println("Card ejected.");
            atmMachine.setAtmState(atmMachine.getNoCardState());
        } else {
            System.out.println(cash + "$ is provided by the machine.");
            atmMachine.setCashInMachine(atmMachine.cashInMachine - cash);

            System.out.println("Card ejected.");
            atmMachine.setAtmState(atmMachine.getNoCardState());

            if (atmMachine.cashInMachine <= 0) {

                atmMachine.setAtmState(atmMachine.getNoCashState());
            }
        }
    }
}
