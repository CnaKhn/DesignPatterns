package State;

public class ATMMachine {
    ATMState atmState;
    ATMState hasCard;
    ATMState noCard;
    ATMState hasCorrectPin;
    ATMState atmOutOfMoney;

    int cashInMachine = 2000;
    boolean correctPinEntered = false;

    public ATMMachine() {
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfMoney = new NoCash(this);
        atmState = noCard;

        if (cashInMachine < 0) {
            atmState = atmOutOfMoney;
        }
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard() {
        atmState.insertCard();
    }

    public void ejectCard() {
        atmState.ejectCard();
    }

    public void requestCash(int cash) {
        atmState.requestCash(cash);
    }

    public void insertPin(int pin) {
        atmState.insertPin(pin);
    }

    public ATMState getYesCardState() {
        return hasCard;
    }

    public ATMState getNoCardState() {
        return noCard;
    }

    public ATMState getHasPin() {
        return hasCorrectPin;
    }

    public ATMState getNoCashState() {
        return atmOutOfMoney;
    }

}
