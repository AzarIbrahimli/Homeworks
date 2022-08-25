package homework6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});
        Human mother = new Human("Jane","Karleone",1957,95,new String[][]{{Human.name(DayOfWeek.Monday), "study"}});
        Human father = new Human("Vito","Karleone",1955,90,new String[][]{{Human.name(DayOfWeek.Monday), "go to cinema"}});
        Human mom = new Human("Vito","Karlee",1955,90,new String[][]{{Human.name(DayOfWeek.Monday), "go to cinema"}});
        Human child1 = new Human("Victor","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
        Human child2= new Human("James","Karleone",1977,95,new String[][]{{Human.name(DayOfWeek.Monday), "sing"}});  //second family
        Pet pet2 = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});

        Family family = new Family(father,mother,pet, new ArrayList<>());;
        System.out.println(family);  //without child
        family.addChild((child1));
        System.out.println(family);  //With single child
        family.countFamily();
        family.addChild((child2));   //with 2 children
        System.out.println(family);
        family.countFamily();                 //countFamily method
        family.deleteChild(1);     //deleteChild method
        System.out.println(family);          //after delete a child
        System.out.println("Count of family: "+family.countFamily());
        System.out.println(pet.equals(pet2));
    }
}
