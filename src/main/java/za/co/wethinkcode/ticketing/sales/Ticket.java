package za.co.wethinkcode.ticketing.sales;

public abstract class Ticket {

    private final String ticketId;
    private final String holderName;
    private String seatLable;
    private double price;
    private  boolean used = false;



    public Ticket(String ticketId, String holderName, String seatLabel, double price) {
        this.ticketId = ticketId;
        this.holderName = holderName;
        this.seatLable = seatLabel; 
        if(price <= 0){throw new IllegalArgumentException("price cannot be R0 or less");}
        this.price = price;
        this.used = false;
    }

    public String getTicketId() {
       return ticketId;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getSeatLabel() {
        return  seatLable;
    }

    public void updateSeatLabel(String seatLabel) {
        if(used){throw new IllegalArgumentException();}
        this.seatLable = seatLabel;
    }

    public double getPrice() {
       return price;
    }

    public void updatePrice(double price) {
       if(price <= 0){throw new IllegalArgumentException();}
       this.price = price;
    }

    public boolean isUsed() {
        return used;
    }

    public void markUsed() {
        this.used = true;
    }

    @Override
    public String toString() {
       return  "ticket id" + getTicketId() + 
       "holder's name" + getHolderName();
    }

    /** Returns the total the customer pays for this ticket, in Rands. */
    public abstract double totalCost();



    /** Returns the gate this ticket's holder must use. */
    public abstract String entryGate() ;

    /** Returns a short label for this kind of ticket, e.g. "General". */
    public abstract String ticketClass();
    
}
