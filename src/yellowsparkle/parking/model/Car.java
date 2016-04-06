package yellowsparkle.parking.model;

public class Car {
    private Ticket[] tickets;
    private Status status;
    private CarDecision decision;
    private int lifespan;

    /**
     * Constructor for objects of class Car
     */
    public Car(CarDecision decision, Ticket... tickets) {
        this.decision = decision;
        this.tickets = tickets;
        this.lifespan = 0;
        this.status = Status.ENTER;
    }
    public void tick() {
        lifespan++;
        status = decision.decide(status);
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Ticket[] getTickets() {
        return tickets;
    }

    public Status getStatus() {
        return status;
    }

    public int getLifespan() {
        return lifespan;
    }

    public enum Status {
        ENTER, PARK, EXIT_QUEUE, EXIT_WAIT
    }
}