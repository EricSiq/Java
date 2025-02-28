public class Swim implements SwimBehavior {
    private final String type;

    // Constructor to set behavior dynamically
    public Swim(String type) {
        this.type = type.toLowerCase();
    }

    @Override
    public void swim() {
        switch (type) {
            case "swim" -> System.out.println("This duck is swimming.");
            case "float" -> System.out.println("This duck is floating.");
            case "drown" -> System.out.println("This duck is drowning.");
            default -> System.out.println("Unknown swimming behavior.");
        }
    }
}
