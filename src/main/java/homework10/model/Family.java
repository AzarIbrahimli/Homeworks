package homework10.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private Set<Pet> pet;


    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Human getChild(int index) {
        if(index<children.size()){
            return children.get(index);
        }
        else throw new IllegalArgumentException("Index out of range");
    }


    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }


    public Family() {
    }
    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        List<Human> children = new ArrayList<>();
        this.children = children;
    }
    public Family(Human mother, Human father, Set<Pet> pet) {
        this.mother = mother;
        this.father = father;
        this.pet=pet;
        List<Human> children = new ArrayList<>();
        this.children = children;
    }


    public List<Human> addChild(Human child) {
        children.add(child);
        return children;
    }

    public boolean deleteChild(int index) {
        if(index>=0 && index<children.size()){
            children.remove(index);
            return true;
        }
        else return false;
    }


    public boolean deleteChild(Human child){
        boolean result = false;
        for(int i = 0;i<children.size(); i++){
            if(child.equals(children.get(i))){
                children.remove(child);
                result = true;
            }
        }
        return result;
    }


    public int countFamily(){
        return children.size() + 2;
    }

    @Override
    public String toString() {

            return "Family{" +
                    "mother=" + mother +
                    ", father=" + father +
                    ", children=" + children +
                    ", pet=" + getPet() +
                    '}';
        }


    @Override
    public boolean equals(Object given) {
        if (given == null) return false;
        if (given==this) return true;
        if(!(given instanceof Human)) return false;
        Family that = (Family) given;
        return mother.getName().equals(that.mother.getName())
                && father.getName().equals(that.father.getName());
    }
}

