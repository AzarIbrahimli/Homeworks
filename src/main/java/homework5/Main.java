package homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat","Mastan", 2, 20, new String[]{"eat,drink,sleep"});
        Human mother = new Human("Jane","Karleone",1956,95,new String[][]{{"Monday, study"}});
        Human father = new Human("Vito","Karleone",1955,90,new String[][]{{"Monday, go to cinema"}});
        Human child= new Human("Michael","Karleone",1977,95,new String[][]{{"Monday, work out"}});

        Human baby = new Human("Victor","Karleone",1980,99, new String[][]{{"Tuesday, play"}});
//        child.describePet();
//        child.greetPet();
//        pet.respond();
//        pet.eat();
//        pet.foul();
        System.out.println(child);
        Family family = new Family(father,mother,pet);
        System.out.println("1");
        System.out.println(family);
        family.addChild(baby);
        int c=family.countFamily();
        System.out.println("2");
        System.out.println(family);
        System.out.println(c);



    }
}
