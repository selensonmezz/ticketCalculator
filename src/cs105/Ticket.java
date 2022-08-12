package cs105;

public abstract class Ticket {
    private int adultCount;
    private int childCount;

    public Ticket(int adultCount, int childCount) {
        this.adultCount = adultCount;
        this.childCount = childCount;
    }

    public abstract double calculatePrice();

    protected int getChildCount() {
        return this.childCount;
    }

    protected int getAdultCount() {
        return this.adultCount;
    }

    @Override
    public String toString() {
        return "Number of Adults: " + this.adultCount + "\n"
                + "Number of Children: " + this.childCount + "\n"
                + "Total Price is " + this.calculatePrice();
    }
}
