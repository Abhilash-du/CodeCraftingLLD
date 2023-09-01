package SOLID.Liskov_Substitution.src.BirdExample.Approach1;

public abstract class Bird {
    private Integer weight;
    private String colour;
    private String size;
    private String beakType;
    private BirdType type;

    public Bird(Integer weight, String colour, String size, String beakType, BirdType type) {
        this.weight=weight;
        this.colour=colour;
        this.size=size;
        this.beakType=beakType;
        this.type=type;
    }

    public abstract void makeSound();
}