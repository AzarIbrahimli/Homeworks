package homework12.test;

import homework12.gender.Man;
import homework12.gender.Woman;
import homework12.model.Family;
import homework12.model.Human;
import homework12.pattern.collection.CollectionFamilyDao;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testCollectionFamilyDao {
    Human mother = new Woman("Malahat","Ibrahimli","27/07/1968");
    Human father = new Man("Abdurahim","Ibrahimli","27/07/1954");
    Family family = new Family(mother,father);
    List<Family> list = new ArrayList<>();
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();

    public testCollectionFamilyDao() throws ParseException {
    }


    @Test
    public void save() throws ParseException {
        Human mother2 = new Woman("Malahat","Ibrahimli","27/07/1968");
        Human father2 = new Man("Abdurahim","Ibrahimli","27/07/1954");
        Family family2 = new Family(mother2,father2);
        collectionFamilyDao.saveFamily(family);
        collectionFamilyDao.saveFamily(family2);
        assertEquals(2,collectionFamilyDao.getAllFamilies().size());
    }

    @Test
    public void deleteFamily() throws ParseException {
        Human mother2 = new Woman("Malahat","Ibrahimli","27/07/1968");
        Human father2 = new Man("Abdurahim","Ibrahimli","27/07/1954");
        Family family2 = new Family(mother2,father2);
        list.add(family);
        list.add(family2);

    }
}
