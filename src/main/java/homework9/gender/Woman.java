package homework9.gender;


import homework9.model.Human;

import java.util.Map;

public final class Woman extends Human {

    public Woman(String name, String surname) {
        super(name, surname);
    }
    public Woman(String name, String surname, int dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public Woman(String name, String surname, int dateOfBirth, int iq, Map<String,String> schedule) {
        super(name, surname, dateOfBirth, iq, schedule);
    }

    public Woman() {
    }

//    @Override
//    public void greetPet() {
//        System.out.println("Hi, my dear pet <3");
//    }
//    public void makeUp(){
//        System.out.println("I am making up");
//    }
}
