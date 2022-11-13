package homework11.model;

import homework11.enums.Species;

import java.util.Set;

public abstract class Pet {
    private Species species;
    private String nickname;
    private int age;
    private int trickLevel;
    private Set<String> habits;
    boolean firstConstructor = false;


    public Species getSpecies() {
        return Species.Unknown;
    }
    public String getNickname() {
        return nickname;
    }
    public int getTrickLevel() {
        return trickLevel;}
    public int getAge() {
        return age;
    }
    public Set<String> getHabits() {
        return habits;
    }


    public void setSpecies(Species species) {
        this.species = species;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setTrickLevel(int trickLevel) {
        this.trickLevel = trickLevel;
    }
    public void setHabits(Set<String> habits) {
        this.habits = habits;
    }



    public void eat(){
        System.out.println( "I am eating");
    }
    public abstract void respond();



    @Override
    public String toString() {
        if (firstConstructor == true){
            return species+("( nickname='" + nickname );
        }
        else  return species+("( nickname='" + nickname + "',age=" + age + ", tricklevel= " + trickLevel + ", habits= " + habits);
    }


    public Pet(String nickname) {
        this.species = Species.Unknown;
        this.nickname = nickname;
        firstConstructor = true;

    }
    public Pet(String nickname, int age, int trickLevel, Set<String> habits) {
        this.species = Species.Unknown;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet() {
    }
}
