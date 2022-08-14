package homework7;

public class RoboCat extends Pet implements FoulAnimals{
    public RoboCat(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello,owner.I am " + getNickname() + ".I miss you! ");
    }

    @Override
    public void foul() {
        System.out.println("I must cover it up");
    }
}
