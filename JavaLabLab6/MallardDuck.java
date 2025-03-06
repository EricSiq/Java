// Mallard Duck - flies, quacks, and swims
public class MallardDuck extends Duck {
    public MallardDuck() {
        super("Mallard Duck", new FlyWithWings(), new Quack(), new Swim(Swim.SwimType.SWIM));
    }
}
