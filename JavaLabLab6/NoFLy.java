// Ducks that cannot fly
public class NoFLy implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("This duck cannot fly.");
    }
}