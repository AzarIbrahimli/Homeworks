package homework8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class Family  {
    private Human father;
    private Human mother;
    private List<Human> children;
    private Set<Pet> pet;


    /**  getters  */
    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    /**  setters  */
    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }


    public Family(Human father, Human mother, Set <Pet> pet) {
        this.father = father;
        this.mother = mother;
        List<Human> children = new ArrayList<>();
        this.children = children;
        this.pet = pet;

    }
//        protected void finalize(){
//            System.out.println("Object is removing");
//        }

    public void addChild(Human child){
        this.children.add(child);
    }
    public void deleteChild(int indexOfchild){
        children.remove(indexOfchild);
    }
    public void countFamily(){
        int count= this.children.size();
        System.out.println("The amount of family members: "+ (count+2));  //  (+2) for mother and father
    }
//    @Override
//    public boolean equals(Object x){
//        if(this == x) return true;
//        if(!(x instanceof Family)) return false;
//        Family that = (Family) x;
//        return this.pet.getHabits().equals(that.pet.getHabits());
//    }
    public Family(){}



    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }

//    @Override
//    public void greetPet() {
//
//    }
}

