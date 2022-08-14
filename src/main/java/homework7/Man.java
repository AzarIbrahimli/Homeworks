package homework7;

public class Man extends Human implements Petgreet{
    Pet pet;
    public Man(String humanName, String humanSurname, int humanBirth, int humanIq, String[][] schedule) {
        super(humanName, humanSurname, humanBirth, humanIq, schedule);
    }
    public void greetPet() {
        System.out.println("Hi, darling");
    }
    public void Workout(){
        System.out.println("I do pull-up every day");
    }
}
