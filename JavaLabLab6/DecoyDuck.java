// Decoy Duck - does not fly, does not quack, and drowns
public class DecoyDuck extends Duck {
    public DecoyDuck() {
        super("Decoy Duck", new NoFLy(), new MuteQuack(), new Swim("drown"));
    }
}
