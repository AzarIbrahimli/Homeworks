package homework12;

public class DomesticCat extends Pet implements FoulAnimals {
    @Override
    public void respond() {
        System.out.println("Hello,owner.I am " + getNickname() + ".I miss you! ");
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it");
    }
}
