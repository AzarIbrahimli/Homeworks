package homework10;


import java.util.Map;

interface Petgreet{
    void greetPet();
}
enum DayofWeek{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday
}
public abstract class Human {
    private String name;
    private String surname;
    private int dateOfBirth;
    private int iqLevel;
    private Pet pet;
    private Map<DayofWeek,String> schedule;
    private Family family;
    public static String name(DayofWeek dayofWeek){
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

    public Pet getPet() {
        return pet;
    }

    public Map<DayofWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayofWeek, String> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    /** getters */

    public void setFamily(Family family) {
        this.family = family;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
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
                ", schedule=" + schedule +
                '}';
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.getNickname());
    }


//
//    public void describePet() {
//        if (pet.getTrickLevel() > 50) {
//            System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old, he is very sly");
//        } else {
//            System.out.println("I have a " + pet.getSpecies() + ". He is " + pet.getAge() + " years old, he is almost not sly");
//        }
//    }


    public Human(String humanName, String humanSurname, int humanBirth, int humanIq, Map<DayofWeek, String> schedule) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
        this.schedule = schedule;
    }




    public Human(String humanName, String humanSurname, int humanBirth, int humanIq) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
        this.iqLevel = humanIq;

    }

    public Human() {
    }

    public void describeAge(){
        long time = System.currentTimeMillis() / 1000; //For conversion of milliseconds to seconds, since 1 second = 10³ milliseconds
        long period = time - dateOfBirth/1000;
        long day = period /86400; // 86400 seconds per day
        long months = day / 30;
        long year = months /12;
        System.out.printf("%d years, %d months, %d days", year, months, day);

    }
}
