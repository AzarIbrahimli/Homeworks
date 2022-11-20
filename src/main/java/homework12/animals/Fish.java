package homework12.animals;



import homework12.enums.Species;
import homework12.model.Pet;

import java.util.Set;

public class Fish extends Pet {
    public Fish(String nickname) {
        super(nickname);
        super.setSpecies(Species.Fish);
    }

    public Fish(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.Fish);
    }

    public Fish() {
        super.setSpecies(Species.Fish);
    }

    @Override
    public void respond() {
        System.out.println("I am " + getNickname());
    }
}
