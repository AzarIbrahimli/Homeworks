package homework9.test;
import homework9.dao.CollectionFamilyDao;
import homework9.dao.FamilyService;
import homework9.gender.Man;
import homework9.gender.Woman;
import homework9.model.Family;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
    FamilyService familyService = new FamilyService(collectionFamilyDao);

    Man husband = new Man("Ilgar", "Ibrahimli", 1988);
    Woman wife = new Woman("Leyla", "Ibrahimli", 1994);
    Family family = new Family(wife, husband);


    @Test
    public void createNewFamily() {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getAllFamilies() {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getFamiliesBiggerThan() {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getFamiliesBiggerThan(1).size());
    }

    @Test
    public void getFamiliesLessThan() {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(0, familyService.getFamiliesLessThan(1).size());

    }

    @Test
    public void CountFamiliesWithMemberNumber(){
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.CountFamiliesWithMemberNumber(2));
    }

    @Test
    public void deleteFamilyByIndex(){
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.getAllFamilies().size());
        familyService.deleteFamilyByIndex(0);
        assertEquals(1,familyService.getAllFamilies().size());
    }

    @Test
    public void bornChild(){
        collectionFamilyDao.saveFamily(family);
        assertEquals(0,familyService.getAllFamilies().get(0).getChildren().size());
        familyService.bornChild(family,"Azar","Nigar");
        assertEquals(1,familyService.getAllFamilies().get(0).getChildren().size());
    }

    @Test
    public void adoptChild(){
        collectionFamilyDao.saveFamily(family);
        assertEquals(0,familyService.getAllFamilies().get(0).getChildren().size());
        Man child = new Man();
        familyService.adoptChild(family,child);
        assertEquals(3,family.countFamily());
    }

    @Test
    public void deleteAllChildOlderThan(){
        collectionFamilyDao.saveFamily(family);
        Man child = new Man("Vusal","Ibrahimli",1998);
        familyService.adoptChild(family,child);
        Man child1 = new Man("Vusal","Ibrahimli",1988);
        familyService.adoptChild(family,child1);
        Man child2 = new Man("Vusal","Ibrahimli",2001);
        familyService.adoptChild(family,child2);
        familyService.deleteAllChildrenOlderThan(23);
        assertEquals(3,family.countFamily());
    }

    @Test
    public void count(){
        collectionFamilyDao.saveFamily(family);
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", 1995), new Man("Vugar", "Ibrahimli", 1987));
        assertEquals(2,familyService.count());
    }







}
