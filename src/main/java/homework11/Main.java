package homework11;

import homework11.animals.DomesticCat;
import homework11.animals.Fish;
import homework11.animals.RoboCat;
import homework11.gender.Man;
import homework11.gender.Woman;
import homework11.model.Family;
import homework11.model.Human;
import homework11.model.Pet;
import homework11.pattern.collection.CollectionFamilyDao;
import homework11.pattern.controller.FamilyController;
import homework11.pattern.service.FamilyService;

import java.text.ParseException;
import java.util.HashSet;
import java.util.Set;


public class Main {
    public static void main(String[] args) throws ParseException {
        CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
        FamilyService familyService = new FamilyService(collectionFamilyDao);
        FamilyController familyController = new FamilyController(familyService);
        Set<Pet> mypets = new HashSet<>();
        Man man = new Man("Azar","Ibrahimli","27/07/1998");
        Woman woman = new Woman("Nigar","Ibrahimli","27/07/2000");
        Pet mypet = new RoboCat("RoboCat");
        Pet myfish = new Fish("Fish");

        mypets.add(mypet);
        mypets.add(myfish);
        Family family = new Family(woman,man,mypets);



        Set<Pet> mypets2 = new HashSet<>();
        Man man2 = new Man("Azar2","Ibrahimli");
        Woman woman2 = new Woman("Nigar2","Ibrahimli");
        Man child = new Man("Odar","Ibrahimli","27/07/2007");
        Man child2 = new Man("Omar","Ibrahimli","27/07/2005");
        Pet mypet2 = new RoboCat("RoboCat2");
        Pet myfish2 = new Fish("Fish2");
        mypets2.add(mypet2);
        mypets2.add(myfish2);
        Family family2 = new Family(woman2,man2,mypets2);
        family2.addChild(child);
        family2.addChild(child2);

        collectionFamilyDao.saveFamily(family);
        collectionFamilyDao.saveFamily(family2);
        System.out.println(collectionFamilyDao.getAllFamilies());
        System.out.println(child2.describeAge());
//
//
//        System.out.println(collectionFamilyDao.getFamilyByIndex(1));
//        System.out.println(collectionFamilyDao.deleteFamily(1));
//        System.out.println(collectionFamilyDao.getAllFamilies());
//
//        System.out.println(collectionFamilyDao.deleteFamily(family));
//        System.out.println(collectionFamilyDao.getAllFamilies());


//        familyService.displayAllFamilies();
//        System.out.println(familyService.getAllFamilies());
//        System.out.println(familyService.getFamiliesLessThan(5));
//        System.out.println(familyService.CountFamiliesWithMemberNumber(2));

//        System.out.println(familyService.createNewFamily(new Human("Leyla", "Aliyeva",2001), new Human("Mahammad","Aliyev",1999)));
//        familyService.displayAllFamilies();
//        familyService.deleteFamilyByIndex(1);
//        familyService.displayAllFamilies();
//        System.out.println(familyService.getAllFamilies());

//        System.out.println("-------------------");
//        System.out.println(familyService.bornChild(family2,"Reza","Su"));
//        familyService.displayAllFamilies();


//        Human adoptChild = new Woman("Niga","Aliyev","27/07/1999");
//        familyService.adoptChild(family,adoptChild);
//        familyService.displayAllFamilies();

//        System.out.println(familyService.count());
//
//        System.out.println(familyService.getFamilyById(0));
//
//        System.out.println(familyService.getPets(0));
//        System.out.println(familyService.addPet(0,new DomesticCat("Leo")));
//        System.out.println(familyService.getPets(0));
//        System.out.println("\n");

//        System.out.println(familyService.getAllFamilies().get(0).getChildren());
//        System.out.println(familyService.getAllFamilies().get(1).getChildren());
//        System.out.println("\n");
//        System.out.println(familyService.deleteAllChildrenOlderThan(20));
//        System.out.println(familyService.getAllFamilies().get(0).getChildren());
//        System.out.println(familyService.getAllFamilies().get(1).getChildren());
        System.out.println(family.countFamily());
        System.out.println(family2.countFamily());
        System.out.println(familyController.countFamiliesWithMemberNumber(1));//0
        System.out.println(familyController.countFamiliesWithMemberNumber(2));//1
        System.out.println(familyController.countFamiliesWithMemberNumber(3));//0
        System.out.println(familyController.countFamiliesWithMemberNumber(4));//1


        }
    }