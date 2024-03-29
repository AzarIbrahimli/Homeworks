package homework6;
import java.util.ArrayList;



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


        public Family(Human father, Human mother, Pet pet,ArrayList<Human> children) {
            this.father = father;
            this.mother = mother;
//            ArrayList<Human> children = new ArrayList<>();
            this.children = children;
            this.pet = pet;

        }


        public void addChild(Human child){
            this.children.add(child);
        }
        public void deleteChild(int indexOfchild){
            if(indexOfchild>children.size()){
                System.out.println(children);
            }
            else{
                children.remove(indexOfchild);
            }
        }
        public void deleteChild(Human child){
            children.remove(child);
        }
        public int countFamily(){
            return this.children.size()+2;
//            System.out.println("The amount of family members: "+ (count+2));  //  (+2) for mother and father
        }
//        @Override
//        public boolean equals(Object x){
//            if(this == x) return true;
//            if(!(x instanceof Family)) return false;
//            Family that = (Family) x;
//            return this.pet.getHabits().equals(that.pet.getHabits());
//        }

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
