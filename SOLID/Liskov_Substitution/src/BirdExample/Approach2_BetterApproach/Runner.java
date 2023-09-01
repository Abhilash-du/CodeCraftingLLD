package SOLID.Liskov_Substitution.src.BirdExample.Approach2_BetterApproach;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Parrot parrot = new Parrot(10, "Green", "Small", "Sharp", BirdType.Parrot);
        // if we use Bird Parrot, it wont be having fly()
        Eagle eagle = new Eagle(20, "Brown", "Medium", "Sharp", BirdType.Eagle);
        flyAll(List.of(eagle,parrot));

        Bird penguin = new Penguin(30, "Black", "Large", "Sharp", BirdType.Penguin);
        penguin.makeSound();
    }

    private static void flyAll(List<Flyable> birds){
        birds.forEach(Flyable::fly);
    }  //subtyping
}

//Over here we are creating interface for different features, which decreases the overhead of creating the hierarchical changes
// to add a new feature
