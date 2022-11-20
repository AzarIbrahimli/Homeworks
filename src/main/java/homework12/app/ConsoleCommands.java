package homework12.app;

import homework12.animals.Dog;
import homework12.animals.DomesticCat;
import homework12.exception.FamilyOverflowException;
import homework12.gender.Man;
import homework12.gender.Woman;
import homework12.model.Family;
import homework12.model.Human;
import homework12.model.Pet;
import homework12.pattern.collection.CollectionFamilyDao;
import homework12.pattern.controller.FamilyController;
import homework12.pattern.service.FamilyService;

import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class ConsoleCommands {

    CollectionFamilyDao collection = new CollectionFamilyDao();
    FamilyService service = new FamilyService(collection);
    FamilyController controller = new FamilyController(service);




    public void testData() throws ParseException {
        /** Family 1*/
        HashMap<String, String> habitsm = new HashMap<>();
        habitsm.put("Friday=", "Fitness");
        habitsm.put("Monday=", "Library");
        HashMap<String, String> habitsf = new HashMap<>();
        habitsf.put("Friday=", "Library");
        habitsf.put("Monday=", "Fitness");
        HashMap<String, String> habitsOne = new HashMap<>();
        HashMap<String, String> habitsTwo = new HashMap<>();
        HashMap<String, String> habitsThree = new HashMap<>();
        habitsf.put("Friday=", "Music");
        Human man = new Man("Karl", "Bibo", "10/12/1990", 90, habitsf);
        Human woman = new Woman("Kate", "Bibo", "03/03/1991", 95, habitsm);
        Man child = new Man("Donna", "Bibo", "23/10/1988", 92, habitsOne);
        Woman child2 = new Woman("Sun", "Bibo", "23/10/2018", 92, habitsTwo);
        Man child3 = new Man("Kurt", "Kobein", "05/05/2003", 85, habitsThree);

        Set<Pet> mypets = new HashSet<>();
        HashSet<String> habitsDog = new HashSet<>();
        habitsDog.add("sleep");
        HashSet<String> habitsCat = new HashSet<>();
        habitsCat.add("eat");
        habitsCat.add("play");
        Pet dog = new Dog("Jack", 3, 35, habitsDog);
        Pet cat = new DomesticCat("Oscar", 5, 81, habitsCat);
        mypets.add(dog);
        mypets.add(cat);
        Family family = new Family(woman, man, mypets);
        family.addChild(child);
        controller.adoptChild(family, child2);
        family.addChild(child3);


        /** Family 2*/
        Human man2 = new Man("Ricardo", "Toms", "10/12/1990");
        Human woman2 = new Woman("Jennifer", "Toms", "03/03/1991");
        Man childf2 = new Man("Donna", "Yoms", "23/10/1998");
        Set<Pet> mypets2 = new HashSet<>();
        HashSet<String> habitsDog2 = new HashSet<>();
        habitsDog2.add("sleep");
        Pet dog2 = new Dog("Jack", 3, 35, habitsDog2);
        mypets.add(dog2);
        Family family2 = new Family(woman2, man2, mypets2);
        family2.addChild(childf2);

        collection.saveFamily(family);
        collection.saveFamily(family2);
    }
    public void displayAll(){
        controller.displayAllFamilies();
    }
    public void greaterThan(int number){
        List<Family> greaterThan = new ArrayList<>();
        greaterThan = controller.getAllFamilies().stream().filter(f->f.countFamily()>number).collect(Collectors.toList());
        greaterThan.forEach(x-> System.out.println(x));
    }
    public void lessThan(int number){
        List<Family> greaterThan = new ArrayList<>();
        greaterThan = controller.getAllFamilies().stream().filter(f->f.countFamily()<number).collect(Collectors.toList());
        greaterThan.forEach(x-> System.out.println(x));
    }
    public int equal(int number){
        int result= controller.getAllFamilies().stream().filter(f->f.countFamily()==number).collect(Collectors.toList()).size();
        return result;
    }
    public void createNewFamily() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mother name: ");
        String motherName = sc.next();
        System.out.println("Mother surname: ");
        String motherSurname = sc.next();
        System.out.println("Mother birth day/month/year: ");
        String motherBirthYear = sc.next();
        System.out.println("Mother iq: ");
        int motherIq = sc.nextInt();
        System.out.println("Father name: ");
        String fatherName = sc.next();
        System.out.println("Father surname: ");
        String fatherSurname = sc.next();
        System.out.println("Father birth day/month/year: ");
        String fatherBirthYear = sc.next();
        System.out.println("Father iq: ");
        int fatherIq = sc.nextInt();
        Woman mother = new Woman(motherName,motherSurname,motherBirthYear,motherIq);
        Man father = new Man(fatherName,fatherSurname,fatherBirthYear,fatherIq);
        Family family = new Family(mother,father);
        collection.saveFamily(family);
        System.out.println("New family created");;
    }
    public void deleteFamily(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID: ");
        int id = sc.nextInt();
        controller.getAllFamilies().remove(id-1);
        System.out.println("Deleted");
    }
    public void bornChild() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Family id: ");
        int familyId = sc.nextInt();
        if(controller.getFamilyById(familyId-1).countFamily()>5){
            throw new FamilyOverflowException("Are you serious? You have more than 4 children");
        }
        System.out.println("Masculine name:  ");
        String boyName = sc.next();
        System.out.println("Feminine name: ");
        String girlName = sc.next();
        System.out.println("IQ : ");
        int iq = sc.nextInt();
        controller.bornChild(controller.getFamilyById(familyId-1),boyName,girlName,iq);
        System.out.println("Child added");
    }
    public void adoptChild() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Family id: ");
        int id = sc.nextInt();
        if(controller.getFamilyById(id-1).countFamily()>5){
            throw new FamilyOverflowException("Are you serious? You have more than 4 children");
        }
        System.out.println("Gender: \n1. Boy\n2. Girl\n1 or 2:  ");
        int gender = sc.nextInt();
        System.out.println("Child name: ");
        String childName = sc.next();
        System.out.println("Child surname: ");
        String childSurname = sc.next();
        System.out.println("Child birth day/month/year: ");
        String childBirthYear = sc.next();
        System.out.println("Child iq: ");
        int childIq = sc.nextInt();
        if(gender == 1){
            Man boy = new Man(childName,childSurname,childBirthYear,childIq);
            controller.adoptChild(collection.getFamilyByIndex(id-1),boy);
        }else{
            Woman girl = new Woman(childName,childSurname,childBirthYear,childIq);
            controller.adoptChild(collection.getFamilyByIndex(id-1),girl);
        }
        System.out.println("Child added");
    }
    public void deleteAgeOlder(){
        controller.deleteAllChildrenOlderThan(18);
        System.out.println("Deleted");
    }
}
