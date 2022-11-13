package homework10.model;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

public abstract class Human {

    DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String surname;
    private long birthDate;
    private int age;
    private int iq;
    private Family family;
    private Map<String,String> schedule;
    boolean firstConstructor = false;

    Family family1 = new Family();




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public long getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) throws ParseException {
        this.birthDate = formatter.parse(birthDate).getTime();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Map<String, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public boolean isFirstConstructor() {
        return firstConstructor;
    }

    public void setFirstConstructor(boolean firstConstructor) {
        this.firstConstructor = firstConstructor;
    }


    public Family getFamily1() {
        return family1;
    }

    public void setFamily1(Family family1) {
        this.family1 = family1;
    }

        public String describeAge(){
        long current = System.currentTimeMillis() / 1000;
        long duration = current - birthDate /1000;
        long days = duration / 86400;
        long months = days / 30;
        long year = months / 12;
        months = months % 12;
        days = days % 30;
        return "Years: "+year + " Months: "+months+" Days: "+days;

    }
//    public void greetPet(){
//        for(Pet pet: family1.getPet())
//        System.out.println("Hello, " + pet);
//    }

//    public void describePet() {
//        if(family.getPet().getTrickLevel()>50) {
//            System.out.println( "I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is very sly");
//        }
//        else{
//            System.out.println( "I have a " + family.getPet().getSpecies() + ", he is " + family.getPet().getAge() + " years old, he is almost not sly");
//        }
//    }

//    public boolean feedPet(boolean a){
//        Random rand = new Random();
//        int random = rand.nextInt(100);
//        if(a==true){
//            if(random < family.getPet().getTrickLevel()){
//                System.out.println("Hm... I will feed Jack's "+ family.getPet().getNickname());
//                a=true;
//            }
//            else{
//                System.out.println("I think Jack is not hungry");
//                a=false;
//            }
//        }
//        else System.out.println("I think Jack is not hungry");
//        return a;
//    }

    public Human(String name, String surname) throws ParseException {
        this.name = name;
        this.surname = surname;
    }
    public Human(String name, String surname, String birthDate) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = formatter.parse(birthDate).getTime();
        firstConstructor = true;
        Date date = formatter.parse(birthDate);
    }

    public Human(String name, String surname, String birthDate, int iq, Map<String,String> schedule) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = formatter.parse(birthDate).getTime();
        this.iq = iq;
        this.schedule = schedule;
        Date date = formatter.parse(birthDate);
    }

    public Human(String name, String surname, String birthDate,int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.birthDate = formatter.parse(birthDate).getTime();
        this.iq = iq;
        Date date = formatter.parse(birthDate);
    }

    public Human() throws ParseException {
    }



    @Override
    public String toString() {
        if(firstConstructor==true){
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", dateOfBirth=" + formatter.format(birthDate) +

                    '}';
        }
        else {
            return "Human{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    '}';
        }
//        else {
//            return "Human{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", dateOfBirth=" + dateOfBirth +
//                    ", iq=" + iq +
//                    ", schedule=" + schedule +
//                    '}';
//        }
//        else if(secondtContructor == true){
//            return "Human{" +
//                    "name='" + name + '\'' +
//                    ", surname='" + surname + '\'' +
//                    ", dateOfBirth=" + dateOfBirth +
//                    ", mother=" + mother.name + " "+mother.surname +
//                    ", father=" + father.name +" "+ father.surname + '}';
//        }
//        else if(thirdContructor==true){
//            return "Human{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", dateOfBirth=" + dateOfBirth +
//                ", iq=" + iq +
//                ", mother=" + mother.name + " "+mother.surname +
//                ", father=" + father.name +" "+ father.surname +
//                ", pet=" + pet +
//                    ", schedule=" + Arrays.deepToString(schedule) +
//                '}';}
//        else if(lastContructor == true){
//            return "";
//        }

    }

    @Override
    public boolean equals(Object given) {
        if (given == null) return false;
        if (given==this) return true;
        if(!(given instanceof Human)) return false;
        Human that = (Human) given;
        return getName().equals(that.getName()) &&
                getSurname().equals(that.getSurname()) &&
                getBirthDate()==that.getBirthDate();
    }
}
