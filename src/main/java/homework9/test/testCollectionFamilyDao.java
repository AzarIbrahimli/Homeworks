package homework9.test;


import homework9.dao.CollectionFamilyDao;
import homework9.gender.Man;
import homework9.gender.Woman;
import homework9.model.Family;
import homework9.model.Human;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

public class testCollectionFamilyDao {
    Human mother = new Woman("Malahat","Ibrahimli",1968);
    Human father = new Man("Abdurahim","Ibrahimli",1954);
    Family family = new Family(mother,father);
    List<Family> list = new ArrayList<>();
    CollectionFamilyDao collectionFamilyDao = new CollectionFamilyDao();



    @Test
    public void save(){
        Human mother2 = new Woman("Malahat","Ibrahimli",1968);
        Human father2 = new Man("Abdurahim","Ibrahimli",1954);
        Family family2 = new Family(mother2,father2);
        collectionFamilyDao.saveFamily(family);
        collectionFamilyDao.saveFamily(family2);
        assertEquals(2,collectionFamilyDao.getAllFamilies().size());
    }

    @Test
    public void deleteFamily(){
        Human mother2 = new Woman("Malahat","Ibrahimli",1968);
        Human father2 = new Man("Abdurahim","Ibrahimli",1954);
        Family family2 = new Family(mother2,father2);
        list.add(family);
        list.add(family2);

    }
}
