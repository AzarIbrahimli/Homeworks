package homework7;

public class Woman extends Human implements Petgreet{
    public void greetPet() {
        System.out.println("Hello, my dear");
    }
    public Woman(String humanName, String humanSurname, int humanBirth, int humanIq, String[][] schedule) {
        super(humanName, humanSurname, humanBirth, humanIq, schedule);
    }
    public void makeUp() {
        System.out.println("i should make up before leaving home");
    }
}
