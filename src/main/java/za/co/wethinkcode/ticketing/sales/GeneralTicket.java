package za.co.wethinkcode.ticketing.sales;

public class GeneralTicket extends Ticket {

    public static final double BOOKING_FEE = 20.00;
    public static final String ENTRY_GATE = "Gate C";

    // TODO: add the class hierarchy and any private fields

    public GeneralTicket(String ticketId, String holderName, String seatLabel, double price) {
        super(ticketId, holderName, seatLabel, price);
    }

    public double totalCost() {
       return  getPrice()+ BOOKING_FEE;
    }

    public String entryGate() {
        return ENTRY_GATE;    }

    public String ticketClass() {
        return "General";
    }

    @Override
    public String toString() {
        return "General" + super.toString();
    }
}
