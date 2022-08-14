package homework7;

public class Dog extends Pet implements FoulAnimals{
    public Dog(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("Hello,owner.I am " + getNickname() + ".I miss you! ");
    }

    @Override
    public void foul() {
        System.out.println("It should be covered !");
    }
}
