// Rubber Duck - floats and squeaks, but does not fly
public class RubberDuck extends Duck {
    public RubberDuck() {
        super("Rubber Duck", new NoFLy(), new Squeak(), new Swim(Swim.SwimType.FLOAT));
    }
}
