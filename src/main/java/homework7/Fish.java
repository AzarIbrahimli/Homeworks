package homework7;

public class Fish extends Pet implements FoulAnimals{
    public Fish(String nickname, int age, int tricklevel, String[] habits) {
        super(nickname, age, tricklevel, habits);
    }

    @Override
    public void respond() {
        System.out.println("I'am fish ");    //doesn't know about them at all
    }

    @Override
    public void foul() {
        System.out.println("I d not know about it");
    }
}
