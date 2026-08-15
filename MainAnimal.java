package Mod2;

class Animal {
    String species;

    Animal(String species) {
        this.species = species;
    }

    void displaySpecies() {
        System.out.println("Species: " + species);
    }
}

public class MainAnimal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Panthera leo");

        System.out.println("Accessing species directly: " + myAnimal.species);
        myAnimal.displaySpecies();
    }
}