// Redhead Duck - flies, quacks, and swims
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        super("Redhead Duck", new FlyWithWings(), new Quack(), new Swim(Swim.SwimType.SWIM));
    }
}
