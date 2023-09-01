package SOLID.Liskov_Substitution.src.BirdExample.Approach1;

public abstract class FlyingBird extends Bird {

    public FlyingBird(Integer weight, String colour, String size, String beakType, BirdType type) {
        super(weight, colour, size, beakType, type);
    }

    public abstract void fly();

}
