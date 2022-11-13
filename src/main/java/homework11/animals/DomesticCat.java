package homework11.animals;


import homework11.enums.Species;
import homework11.interfaces.Foul;
import homework11.model.Pet;

import java.util.Set;

public class DomesticCat extends Pet implements Foul {
    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DomesticCat);
    }

    public DomesticCat() {
        super.setSpecies(Species.DomesticCat);
    }

    @Override
    public void respond() {
        System.out.println(getNickname());
    }


    @Override
    public void foul() {
        System.out.println("Domestic cat fouling...");
    }
}
