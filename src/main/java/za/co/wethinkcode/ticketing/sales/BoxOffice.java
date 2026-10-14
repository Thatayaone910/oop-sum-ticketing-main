package za.co.wethinkcode.ticketing.sales;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.security.auth.callback.TextInputCallback;

public class BoxOffice {

    // TODO: declare the private fields
    private final String VenueName;
    private List<Ticket> tickets;

    public BoxOffice(String venueName) {
        // TODO: implement the constructor
        this.VenueName = venueName;
        this.tickets = new ArrayList<>();
    }

    public String getVenueName() {
        return  VenueName;
    }

    public void addTicket(Ticket ticket) {
        for(Ticket t :  tickets){
            if(t.equals(ticket) ){
                throw new IllegalArgumentException();
            }
           
        }
        tickets.add(ticket);
    }

    public Ticket findTicket(String ticketId) {
       for(Ticket t : tickets){
        if(t.getTicketId().equals(ticketId)){
            return t;
        }};
        return null;
    }

    public List<Ticket> getTickets() {
        return Collections.unmodifiableList(tickets);
    }

    public List<Refundable> refundableTickets() {
        List<Refundable> refundable = new ArrayList<>();

        for (Ticket t: tickets)
            if (t instanceof Refundable)
            {refundable.add(t); }
        return refundable;
        
    }

    public double totalRevenue() {
        double sum = 0.0;
        for (Ticket t : tickets) {
            sum += t.totalCost();
        }
        return sum;
    }

    public double totalRefundLiability() {
        double sumRefunds = 0.0;
        for (Ticket t : tickets){
            if(t instanceof Refundable)
            sumRefunds += ((Refundable)t).refundAmount();
        }
        return sumRefunds;
    }
}
