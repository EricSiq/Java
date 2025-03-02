
public class Swim implements SwimBehavior {
    private final String type; // Stores  type of swimming behavior

    /**
     * Constructor to initialize the swimming behavior of a duck.
     * @param type The type of swimming behavior (e.g., "swim", "float", "drown").
     */
    public Swim(String type) {
        this.type = type.toLowerCase(); // Convert input to lowercase for consistency
    }

    /**
     * Executes the swimming behavior based on the assigned type.
     */
    @Override
    public void swim() {
        switch (type) {
            case "swim" -> System.out.println("This duck is swimming gracefully.");
            case "float" -> System.out.println("This duck is floating on the water.");
            case "drown" -> System.out.println("This duck is struggling and drowning.");
            default -> System.out.println("Unknown swimming behavior. Please check input.");
        }
    }
}
