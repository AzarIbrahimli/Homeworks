package homework4;

import java.util.Arrays;

public class Human {
    String name;
    String surname;
    int dateOfBirth;
    Pet pet;
    Human father;
    Human mother;
    int iqLevel;
    String[][] schedule;


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + dateOfBirth +
                ", iq=" + iqLevel +
                ", mother=" + mother.name + " " + mother.surname +
                ", father=" + father.name + " " + father.surname +
                ", pet=" + pet +
                '}';
    }

    public void greetPet() {
        System.out.println("Hello, " + pet.nickname);
    }

    public void describePet() {
        if (pet.trickLevel > 50) {
            System.out.println("I have a " + pet.species + ". He is " + pet.age + " years old, he is very sly");
        } else {
            System.out.println("I have a " + pet.species + ". He is " + pet.age + " years old, he is almost not sly");
        }
    }


    public Human(String humanName, String humanSurname, int humanBirth) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
    }

    public Human(String humanName, String humanSurname, int humanBirth, Human father, Human mother) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
        this.father = father;
        this.mother = mother;
    }

    public Human(String humanName, String humanSurname, int humanBirth, Human father, Human mother, int humanIq, Pet pet) {
        this.name = humanName;
        this.surname = humanSurname;
        this.dateOfBirth = humanBirth;
        this.father = father;
        this.mother = mother;
        this.iqLevel = humanIq;
        this.pet = pet;
    }

    public Human() {
    }

}





