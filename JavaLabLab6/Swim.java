// Implements swimming behavior for ducks
public class Swim implements SwimBehavior {
    // Defines possible swimming behaviors
    public enum SwimType { SWIM, FLOAT, DROWN }

    private final SwimType swimType;

    /**
     * Constructor to initialize swimming behavior using SwimType enum.
     * @param swimType The type of swimming behavior (SWIM, FLOAT, DROWN).
     */
    public Swim(SwimType swimType) {
        this.swimType = swimType;
    }

    /**
     * Executes the swimming behavior based on the assigned type.
     */
    @Override
    public void swim() {
        switch (swimType) {
            case SWIM -> System.out.println("This duck is swimming gracefully.");
            case FLOAT -> System.out.println("This duck is floating on the water.");
            case DROWN -> System.out.println("This duck is struggling and drowning.");
        }
    }
}
