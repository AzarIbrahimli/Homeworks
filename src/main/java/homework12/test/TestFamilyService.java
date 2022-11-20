package homework12.test;

import homework12.gender.Man;
import homework12.gender.Woman;
import homework12.model.Family;
import homework12.pattern.collection.CollectionFamilyDao;
import homework12.pattern.service.FamilyService;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
    FamilyService familyService = new FamilyService(collectionFamilyDao);

    Man husband = new Man("Ilgar", "Ibrahimli", "27/11/1988");
    Woman wife = new Woman("Leyla", "Ibrahimli", "27/11/1994");
    Family family = new Family(wife, husband);

    public TestFamilyService() throws ParseException {
    }


    @Test
    public void createNewFamily() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getAllFamilies() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getFamiliesBiggerThan() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getFamiliesBiggerThan(1).size());
    }

    @Test
    public void getFamiliesLessThan() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(0, familyService.getFamiliesLessThan(1).size());

    }

    @Test
    public void CountFamiliesWithMemberNumber() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.countFamiliesWithMemberNumber(2));
    }

    @Test
    public void deleteFamilyByIndex() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.getAllFamilies().size());
        familyService.deleteFamilyByIndex(0);
        assertEquals(1,familyService.getAllFamilies().size());
    }

    @Test
    public void bornChild() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        assertEquals(0,familyService.getAllFamilies().get(0).getChildren().size());
        familyService.bornChild(family,"Azar","Nigar",99);
        assertEquals(1,familyService.getAllFamilies().get(0).getChildren().size());
    }

    @Test
    public void adoptChild() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        assertEquals(0,familyService.getAllFamilies().get(0).getChildren().size());
        Man child = new Man();
        familyService.adoptChild(family,child);
        assertEquals(3,family.countFamily());
    }

    @Test
    public void deleteAllChildOlderThan() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        Man child = new Man("Vusal","Ibrahimli","27/11/1998");
        familyService.adoptChild(family,child);
        Man child1 = new Man("Vusal","Ibrahimli","27/11/1988");
        familyService.adoptChild(family,child1);
        Man child2 = new Man("Vusal","Ibrahimli","27/11/2001");
        familyService.adoptChild(family,child2);
        familyService.deleteAllChildrenOlderThan(23);
        assertEquals(3,family.countFamily());
    }

    @Test
    public void count() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/11/1995"), new Man("Vugar", "Ibrahimli", "27/11/1987"));
        assertEquals(2,familyService.count());
    }







}
