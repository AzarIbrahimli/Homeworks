package homework10.animals;

import homework10.enums.Species;
import homework10.interfaces.Foul;
import homework10.model.Pet;

import java.util.Set;

public class Dog extends Pet implements Foul {
    public Dog(String nickname) {
        super(nickname);
        super.setSpecies(Species.Dog);
    }

    public Dog(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.Dog);
    }

    public Dog() {
        super.setSpecies(Species.Dog);
    }

    @Override
    public void respond() {
        System.out.println( "Hello, owner. I am " + getNickname() + ". I miss you!");
    }

    @Override
    public void foul() {
        System.out.println("Dog is fouling...");
    }
}
