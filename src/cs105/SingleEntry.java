package cs105;

public class SingleEntry extends Ticket {
    private Park park;

    public SingleEntry(String parkName, double parkPrice, int adultCount, int childCount) {
        super(adultCount, childCount);
        this.park = new Park(parkName, parkPrice);
    }

    @Override
    public double calculatePrice() {
        return this.park.getParkPrice() * (this.getAdultCount() + 0.5 * this.getChildCount());
    }

    @Override
    public String toString() {
        return this.park + super.toString();
    }
}
