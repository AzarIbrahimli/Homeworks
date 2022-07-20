package homework4;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("cat","Mastan", 2, 20, new String[]{"eat,sleep"});
        System.out.println(pet);


        Human father = new Human("Ilgar","Ibrahimli",1964);
        Human mother = new Human("Nigar","Ibrahimli",1968);
        Human child = new Human("Vugar","Ibrahimli",1998,father,mother,96, pet);
        child.describePet();
        child.greetPet();
        pet.respond();
        pet.eat();
        pet.foul();

        System.out.println(child);
    }
}
