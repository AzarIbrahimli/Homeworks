package homework11;
import java.util.Map;

public class Man extends Human implements Petgreet {
    Pet pet;
    public Man(String humanName, String humanSurname, int humanBirth, int humanIq, Map<DayofWeek, String> schedule) {
        super(humanName, humanSurname, humanBirth, humanIq, schedule);
    }
    public void greetPet() {
        System.out.println("Hi, darling");
    }
    public void Workout(){
        System.out.println("I do pull-up every day");
    }
}
