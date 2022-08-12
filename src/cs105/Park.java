package cs105;

public class Park {
    private String parkName;
    private double parkPrice;

    public Park(String parkName, double parkPrice) {
        this.parkName = parkName;
        this.parkPrice = parkPrice;
    }

    public double getParkPrice() {
        return this.parkPrice;
    }

    @Override
    public String toString() {
        return this.parkName + ": The price is " + this.parkPrice + "\n";
    }
}
