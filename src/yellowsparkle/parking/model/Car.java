/**
 * @author ITV1G Group 1
 * @version 1.0
 * @since 4/4/16
 */

package yellowsparkle.parking.model;

public class Car {
    private Ticket[] tickets;
    private Status status;
    private CarDecision decision;
    private int lifespan;

    /**
     * Constructor for objects of class Car
     * @param decision makes a decision, exit, enter etc...
     * @param tickets Gives the type of ticket the car has
     */
    public Car(CarDecision decision, Ticket... tickets) {
        this.decision = decision;
        this.tickets = tickets;
        this.lifespan = 0;
        this.status = Status.ENTER;
    }


    /**
     * Every tick it adds +1 to lifespan and possible status change
     */
    public void tick() {
        lifespan++;
        status = decision.decide(status);
    }

    /**
     * sets car with a status
     * @param status car gets set to a new status
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * returns the type of tickets
     * @return tickets type
     */
    public Ticket[] getTickets() {
        return tickets;
    }

    /**
     * Returns the value of status
     * @return the value of status
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Returns the lifespan
     * @return lifespan gives back current lifespan value
     */
    public int getLifespan() {
        return lifespan;
    }

    /**
     * Enum list of all possible statuses.
     */
    public enum Status {
        ENTER, PARK, EXIT_QUEUE, EXIT_WAIT
    }
}
