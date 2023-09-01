package SOLID.Liskov_Substitution.src.BirdExample.Approach1;

public class Penguin extends NonFlyingBird {

    public Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    @Override
    public void makeSound() {
        // TODO Auto-generated method stub
    }

}