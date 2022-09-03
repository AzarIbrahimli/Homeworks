package homework11;
import java.util.Set;

enum Species {
    Cat,
    Dog,
    Rabbit,
    Bird,
    Fish,
    DomesticCat,
    RoboCat
}

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;

    public Species getSpecies() {
        return species;
    }

    public String getNickname() {
        return nickname;
    }

    public int getAge() {
        return age;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public Set<String> getHabits() {
        return habits;
    }

    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return   "{" +
                " nickname='" + nickname +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + habits +
                '}';
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public abstract void respond();

//    public void foul() {
//        System.out.println("I need to cover it up");
//    }


    public Pet(String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet( String nickname, int age, int tricklevel, Set<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = tricklevel;
        this.habits = habits;
    }
//    @Override
//    protected void finalize(){
//        System.out.println("Object is removing");
//    }

    public Pet() {
    }
}
