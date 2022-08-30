package homework9;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> habits = new HashSet<>();
        habits.add("eat,drink,sleep");

        Pet pet = new Dog("Toplan",5,1,habits);
        Map<DayofWeek, String> habitmother = new HashMap<>();
        habitmother.put(DayofWeek.Monday,"Go to cinema");

        Map<DayofWeek, String> habitfather = new HashMap<>();
        habitfather.put(DayofWeek.Sunday,"Go to cinema");

        Map<DayofWeek, String> habitmom = new HashMap<>();
        habitmom.put(DayofWeek.Monday,"Play piano");

        Map<DayofWeek, String> habitchild1 = new HashMap<>();
        habitchild1.put(DayofWeek.Monday,"Go to cinema");

        Map<DayofWeek, String> habitchild2 = new HashMap<>();
        habitchild2.put(DayofWeek.Monday,"Go to cinema");

        Map<DayofWeek, String> habitmother2 = new HashMap<>();
        habitmother2.put(DayofWeek.Monday,"Go to cinema");

        Map<DayofWeek, String> habitfather2 = new HashMap<>();
        habitfather2.put(DayofWeek.Monday,"Go to cinema");


        Human mother = new Woman("Jane","Karleone",1956,95,habitmother);
        Human father = new Man("Vito","Karleone",1955,90, habitfather);
        Human mom = new Woman("Vito","Karlee",1955,90,habitmom);
        Human child1 = new Man("Victor","Karleone",1980,99, habitchild1);
        Human child2= new Woman("James","Karleone",1977,95,habitchild2);  //second family
        Human mother2 = new Woman("Jane","Karleone",1956,95,habitmother2);  //second family
        Human father2 = new Man("Vito","Karleone",1955,90, habitfather2); //second family
        Pet pet2 = new Fish("Nemo", 2, 20, habits);
        Set<Pet> ad = new HashSet<>();
        ad.add(pet2);

        System.out.println(mother);
        Family family = new Family(father,mother,ad);
        Family family2 = new Family(father2,mother2,ad);
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

