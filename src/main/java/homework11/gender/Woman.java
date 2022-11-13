package homework11.gender;

import homework11.model.Human;

import java.text.ParseException;
import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname) throws ParseException {
        super(name, surname);
    }
    public Woman(String name, String surname, String dateOfBirth) throws ParseException {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, String dateOfBirth, int iq, Map<String,String> schedule) throws ParseException {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Woman() throws ParseException {
        super();
    }

//    @Override
//    public void greetPet() {
//        System.out.println("Hi, my dear pet <3");
//    }
//    public void makeUp(){
//        System.out.println("I am making up");
//    }
}
