package Observer;

public class StockObserver implements Observer {
    private double ibmPrice;
    private double googPrice;
    private double aaplPrice;

    private int observerID;
    private static int observerIDTracker = 0;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);
    }

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        this.ibmPrice = ibmPrice;
        this.googPrice = googPrice;
        this.aaplPrice = aaplPrice;
        printThePrices();
    }

    private void printThePrices() {
        System.out.println(observerID + "\nIBM: " + ibmPrice +
                "\nAAPL: " + aaplPrice +
                "\nGOOG: " + googPrice + "\n");
    }
}
