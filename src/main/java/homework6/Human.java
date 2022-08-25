package homework6;

import java.util.Arrays;

enum DayOfWeek {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iqLevel;
    private String[][] schedule;

    public static String name(DayOfWeek dayofWeek){
        switch (dayofWeek){
            case Monday -> {
                return "Monday";
            }
            case Tuesday -> {
                return "Tuesday";
            }
            case Wednesday -> {
                return"Wednesday";
            }
            case Thursday -> {
                return"Thursday";
            }
            case Friday -> {
                return"Friday";
            }
            case Saturday -> {
                return"Saturday";
            }
            case Sunday -> {
                return"Sunday";
            }
        }
        return "";
    }

    /** getters */
    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public int getIqLevel() {
        return iqLevel;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    /** getters */
    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }

    public void setIqLevel(int iqLevel) {
        this.iqLevel = iqLevel;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iqLevel +
                ", schedule=" + Arrays.deepToString(getSchedule()) +
                '}';
    }



//    public void greetPet() {
//        System.out.println("Hello, " + pet.getNickname());
//    }
//
//    public void describePet() {
//        if (pet.getTrickLevel() > 50) {
//            System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old, he is very sly");
//        } else {
//            System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old, he is almost not sly");
//        }
//    }


    public Human(String humanName, String humanSurname, int humanBirth) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
    }




    public Human(String humanName, String humanSurname, int humanBirth, int humanIq,String[][]schedule) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
        this.iqLevel = humanIq;
        this.schedule = schedule;
    }


    public Human() {
    }
}
