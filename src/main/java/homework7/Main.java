package homework7;

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//        Pet pet = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});
        Pet pet = new Dog("Toplan",5,1,new String[]{"eat,drink,sleep"});
        Human mother = new Woman("Jane","Karleone",1956,95,new String[][]{{Human.name(DayofWeek.Monday), "study"}});
//        Human mother = new Human("Jane","Karleone",1956,95,new String[][]{{Human.name(DayofWeek.Monday), "study"}});
        Human father = new Man("Vito","Karleone",1955,90,new String[][]{{Human.name(DayofWeek.Monday), "go to cinema"}});
        Human mom = new Woman("Vito","Karlee",1955,90,new String[][]{{Human.name(DayofWeek.Monday), "go to cinema"}});
        Human child1 = new Man("Victor","Karleone",1980,99, new String[][]{{Human.name(DayofWeek.Tuesday), "play"}});
        Human child2= new Woman("James","Karleone",1977,95,new String[][]{{Human.name(DayofWeek.Monday), "sing"}});  //second family
        Human mother2 = new Woman("Jane","Karleone",1956,95,new String[][]{{Human.name(DayofWeek.Monday), "study"}});  //second family
        Human father2 = new Man("Vito","Karleone",1955,90,new String[][]{{Human.name(DayofWeek.Monday), "go to cinema"}}); //second family
        Pet pet2 = new Fish("Nemo", 2, 20, new String[]{"eat,drink,sleep"});

        Family family = new Family(father,mother,pet);
        Family family2 = new Family(father2,mother2,pet2);
        System.out.println(family);  //without child
        family.addChild((child1));
        System.out.println(family);  //With single child
        family.countFamily();
        family.addChild((child2));   //with 2 children
        System.out.println(family);
        family.countFamily();                 //countFamily method
        family.deleteChild(1);     //deleteChild method
        System.out.println(family);          //after delete a child
        family.countFamily();
        System.out.println(pet.equals(pet2));
        mother.greetPet();
        father.greetPet();


    }
}

