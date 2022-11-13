package homework10.animals;

import homework10.enums.Species;
import homework10.interfaces.Foul;
import homework10.model.Pet;

import java.util.Set;

public class RoboCat extends Pet implements Foul {

    public RoboCat(){
        super.setSpecies(Species.RoboCat);
    }
    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.RoboCat);
    }

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.RoboCat);
    }

    @Override
    public void respond() {
        System.out.println("Hi,my owner.I am "+ getNickname()+". How can I help you?");
    }

    @Override
    public void foul() {
        System.out.println("RoboCat fouling...");
    }
}
