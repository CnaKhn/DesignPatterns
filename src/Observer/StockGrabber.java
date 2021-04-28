package Observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    public StockGrabber() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void unregister(Observer observer) {
        int observerIndex = observers.indexOf(observer);
        System.out.println("Observer: " + (observerIndex + 1) + " deleted.");
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIbmPrice(double ibmPrice) {
        this.ibmPrice = ibmPrice;
        notifyObserver();
    }

    public void setGoogPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObserver();
    }

    public void setAaplPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObserver();
    }
}
