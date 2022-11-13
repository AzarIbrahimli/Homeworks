package homework11.test;

import homework10.gender.Man;
import homework10.gender.Woman;
import homework10.model.Family;
import homework10.pattern.collection.CollectionFamilyDao;
import homework10.pattern.service.FamilyService;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFamilyService {
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();
    FamilyService familyService = new FamilyService(collectionFamilyDao);

    Man husband = new Man("Ilgar", "Ibrahimli", "27/09/1988");
    Woman wife = new Woman("Leyla", "Ibrahimli", "27/09/1994");
    Family family = new Family(wife, husband);

    public TestFamilyService() throws ParseException {
    }


    @Test
    public void createNewFamily() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getAllFamilies() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getAllFamilies().size());
    }

    @Test
    public void getFamiliesBiggerThan() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2, familyService.getFamiliesBiggerThan(1).size());
    }

    @Test
    public void getFamiliesLessThan() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(0, familyService.getFamiliesLessThan(1).size());

    }

    @Test
    public void CountFamiliesWithMemberNumber() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.CountFamiliesWithMemberNumber(2));
    }

    @Test
    public void deleteFamilyByIndex() throws ParseException {
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        collectionFamilyDao.saveFamily(family);
        assertEquals(2,familyService.getAllFamilies().size());
        familyService.deleteFamilyByIndex(0);
        assertEquals(1,familyService.getAllFamilies().size());
    }

    @Test
    public void bornChild() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        assertEquals(0,familyService.getAllFamilies().get(0).getChildren().size());
        familyService.bornChild(family,"Azar","Nigar");
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
    public void count() throws ParseException {
        collectionFamilyDao.saveFamily(family);
        familyService.createNewFamily(new Woman("Fidan", "Ibrahimli", "27/09/1995"), new Man("Vugar", "Ibrahimli", "27/09/1987"));
        assertEquals(2,familyService.count());
    }







}
