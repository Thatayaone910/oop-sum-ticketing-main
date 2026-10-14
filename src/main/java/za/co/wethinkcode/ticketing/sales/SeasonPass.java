package za.co.wethinkcode.ticketing.sales;

public class SeasonPass extends Ticket implements Refundable {

    public static final double SEASON_DISCOUNT = 0.10;
    public static final double REFUND_RATE = 0.50;
    public static final int REFUND_WINDOW_DAYS = 14;
    public static final String ENTRY_GATE = "Gate B";
    private  final int eventCount;

    // TODO: add the class hierarchy and the private field(s)

    public SeasonPass(String ticketId, String holderName, String seatLabel, double price, int eventCount) {
        // TODO: implement the constructor
        super(ticketId, holderName, seatLabel, price);
        if(eventCount < 1){
            throw new IllegalArgumentException();
        }
        this.eventCount = eventCount;
    }

    public int getEventCount() {
        return eventCount;
    }

    public double totalCost() {
        return  getPrice() * getEventCount() * (1 - SEASON_DISCOUNT);
    }

    public String entryGate() {
        return ENTRY_GATE;
    }

    public String ticketClass() {
        return "Season";
    }

    public double refundAmount() {
        return totalCost() * REFUND_RATE;
    }

    public int refundWindowDays() {
        return REFUND_WINDOW_DAYS;
    }

    @Override
    public String toString() {
        super.toString() + "Season" + eventCount;
    }
}
