package domain;

public class Sloth extends Animal {

    private String species;

    public Sloth(String name, int weight, String species) {
        this.name = name;
        this.weight = weight;
        this.species = species;
    }

    public Sloth(String name) {
        this(name, 6, "Three-toed sloth");
    }

    public Sloth() {
        this("Sid", 6, "Three-toed sloth");
    }

    public void climb() {
        System.out.println(name + " slowly climbs a tree...");
    }

    public void hang() {
        System.out.println(name + " hangs from a branch and rests...");
    }

    public void sleep() {
        System.out.println(name + " sleeps peacefully for many hours...");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats leaves very slowly...");
    }

    @Override
    public void speak() {
        System.out.println(name + " makes slow sloth sounds...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpecies:\t" + species + "\nThis is Sloth!";
    }
}
