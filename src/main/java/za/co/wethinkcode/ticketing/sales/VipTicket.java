package za.co.wethinkcode.ticketing.sales;

public class VipTicket extends Ticket implements Refundable {

    public static final double VIP_SURCHARGE = 0.15;
    public static final double BOOKING_FEE = 45.00;
    public static final double REFUND_RATE = 0.80;
    public static final int REFUND_WINDOW_DAYS = 7;
    public static final String ENTRY_GATE = "Gate A";
    private final String perks;

    // TODO: add the class hierarchy and the private field(s)

    public VipTicket(String ticketId, String holderName, String seatLabel, double price, String perks) {
        // TODO: implement the constructor
        super(ticketId, holderName, seatLabel, price);
        this.perks = perks;
    }

    public String getPerks() {
        return perks;
    }

    public double totalCost() {
        return getPrice() * (1 + VIP_SURCHARGE) + BOOKING_FEE;
    }

    public String entryGate() {
        throw new UnsupportedOperationException("TODO");
    }

    public String ticketClass() {
        throw new UnsupportedOperationException("TODO");
    }

    public double refundAmount() {
        throw new UnsupportedOperationException("TODO");
    }

    public int refundWindowDays() {
        throw new UnsupportedOperationException("TODO");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("TODO");
    }
}
