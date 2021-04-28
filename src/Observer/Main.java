package Observer;

public class Main {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver observer1 = new StockObserver(stockGrabber);
        stockGrabber.setIbmPrice(197.00);
        stockGrabber.setGoogPrice(677.60);
        stockGrabber.setAaplPrice(676.40);

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 179.00);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 179.00);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 179.00);

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();
    }
}
