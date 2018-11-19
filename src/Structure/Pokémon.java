package Structure;

import java.util.List;

public class Pokémon {
    /** Data structure for a Pokémon to be displayed in the Pokedex
     */

    private String name;
    private int number;
    private int nationalNumber;
    private List<Type> types;

    private String classification;
    private String description;
    private float height;
    private float weight;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getNationalNumber() {
        return nationalNumber;
    }

    public List<Type> getTypes() {
        return types;
    }

    public String getClassification() {
        return classification;
    }

    public String getDescription() {
        return description;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }
}