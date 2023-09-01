package SOLID.Liskov_Substitution.src.BirdExample.Approach1;

public class Runner {

    public static void main(String[] args) {
        FlyingBird parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        FlyingBird eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);


        eagle.fly();
        parrot.fly();


        NonFlyingBird penguin = new Penguin(30, "Black", "Large", "Sharp", BirdType.Penguin);
        penguin.makeSound(); // Penguin is now not forced to implement fly()

        // A parent should never force a child class to contract
        // At this mp,emt
    }
}
