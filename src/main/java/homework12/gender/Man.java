package homework12.gender;

import homework12.model.Human;

import java.text.ParseException;
import java.util.Map;

public final class Man extends Human {
    public Man(String name, String surname) throws ParseException {
        super(name, surname);
    }
    public Man(String name, String surname, String dateOfBirth) throws ParseException {
        super(name,surname,dateOfBirth);
    }
    public Man(String name, String surname, String dateOfBirth,int iq) throws ParseException {
        super(name, surname, dateOfBirth,iq);
    }

    public Man(String name, String surname, String dateOfBirth, int iq, Map<String,String> schedule) throws ParseException {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Man() throws ParseException {
        super();
    }

//    @Override
//    public void greetPet() {
//        System.out.println("Hi, pet");
//    }
//    public void shave(){
//        System.out.println("Shaving beard");
//    }
}
