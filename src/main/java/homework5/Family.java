package homework5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Family extends Human {
    private Human father;
    private Human mother;
    private ArrayList<Human> children;
    private Pet pet;


    /**  getters  */
    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Pet getPet() {
        return pet;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    /**  setters  */
    public void setPet(Pet pet) {
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


    public Family(Human father, Human mother,Pet pet) {
        this.father = father;
        this.mother = mother;
        ArrayList<Human> children = new ArrayList<>();
        this.children = children;
        this.pet = pet;

    }

    public void addChild(Human child){
        ArrayList<Human> children = new ArrayList<>();
        children.add(child);
    }
    public void deleteChild(int indexOfChild){
        children.remove(indexOfChild);
    }
    public int countFamily(){
        ArrayList<Human> children = new ArrayList<>();
        int count= children.size();
        int famSize=2+count;
        return famSize;
    }
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
}