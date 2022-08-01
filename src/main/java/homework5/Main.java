package homework5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat","Mastan", 2, 20, new String[]{"eat,drink,sleep"});
        Human mother = new Human("Jane","Karleone",1956,95,new String[][]{{"Monday, study"}});
        Human father = new Human("Vito","Karleone",1955,90,new String[][]{{"Monday, go to cinema"}});
        Human child1 = new Human("Victor","Karleone",1980,99, new String[][]{{"Tuesday, play"}});
        Human child2= new Human("James","Karleone",1977,95,new String[][]{{"Thursday, sing"}});

        Family family = new Family(father,mother,pet);
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
        System.out.println(father.equals(mother));




    }
}
