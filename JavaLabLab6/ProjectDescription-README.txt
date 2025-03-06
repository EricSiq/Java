Duck Simulation System 

Overview  
This project implements a Duck Simulation System using the Strategy Design Pattern. It allows different types of ducks to have unique behaviors for flying, quacking, and swimming, which can be dynamically assigned and changed at runtime.  


Class Structure  

`Duck` (Abstract Class)  
- Defines a blueprint for all ducks.  
- Holds references to `FlyBehavior`, `QuackBehavior`, and `SwimBehavior`.  

 `DecoyDuck` (Concrete Class)  
- A type of duck that **does not fly, does not quack, and drowns**.  
- Uses `NoFly`, `MuteQuack`, and `Swim(Swim.SwimType.DROWN)`.  

`FlyBehavior` (Interface)  
- Implemented by `FlyWithWings` and `NoFly`.  

`QuackBehavior` (Interface)  
- Implemented by `Quack` and `MuteQuack`.  

`SwimBehavior` (Interface)  
- Implemented by `Swim`, which uses an enum (`SWIM, FLOAT, DROWN`).  
