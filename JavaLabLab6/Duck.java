// Abstract class defining common Duck properties
public abstract class Duck {
    protected String name;
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    protected SwimBehavior swimBehavior;

    // Constructor
    public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior, SwimBehavior swimBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.swimBehavior = swimBehavior;
    }

    // Display duck type
    public void display() {
        System.out.println("\n" + name + " behavior:");
    }

    // Delegate behavior to specific strategy implementations
    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }
}
