// DecoyDuck - A type of Duck that does not fly, does not quack, and drowns
public class DecoyDuck extends Duck {
    
    /**
     * Constructor for DecoyDuck.
     * Uses composition to set behavior dynamically.
     */
    public DecoyDuck() {
        super("Decoy Duck", 
              new NoFly(),          // Cannot fly
              new MuteQuack(),      // Cannot quack
              new SwimBehaviorImpl(SwimBehaviorImpl.SwimType.DROWN)); // Drowns instead of swimming
    }

    /**
     * Override display method to specify the appearance of DecoyDuck.
     */
    @Override
    public void display() {
        System.out.println("Looks like a wooden decoy duck.");
    }
}
