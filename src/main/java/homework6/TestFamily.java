package homework6;
import  org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFamily {
    Pet pet = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});
    Human mother = new Human("Jane","Karleone",1956,95,new String[][]{{Human.name(DayOfWeek.Monday), "study"}});
    Human father = new Human("Vito","Karleone",1955,90,new String[][]{{Human.name(DayOfWeek.Monday), "go to cinema"}});
    Human child1 = new Human("Victor","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Human testChild = new Human("Rodrigues","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});

    Family family1 = new Family(father,mother,pet,new ArrayList<>());//without child

    ArrayList<Human> addChildren(){
        family1.addChild(child1);
        return family1.getChildren();
    }

    /**  Family for Test   */
    Pet petTest = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});
    Human motherTest = new Human("Jane","Karleone",1956,95,new String[][]{{Human.name(DayOfWeek.Monday), "study"}});
    Human fatherTest = new Human("Vito","Karleone",1955,90,new String[][]{{Human.name(DayOfWeek.Monday), "go to cinema"}});
    Human child1Test = new Human("Victor","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Human testChildTest = new Human("Rodrigues","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Human testChildTest2 = new Human("Rodrigo","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Family familyTest = new Family(father,mother,pet,new ArrayList<>());//without child



    @Test
    public void testAdd(){      //It tests by Reference
        familyTest.addChild(testChildTest);
        assertEquals(family1,familyTest);
    }
    @Test
    public void testAddElement(){   //This test show it increases by 1 element
        familyTest.addChild(testChildTest2);
        assertEquals(3,familyTest.countFamily());
    }

    @Test
    public void  deleteByIndex(){         //After deleting, family member is 2
        familyTest.addChild(testChildTest2);
        familyTest.deleteChild(0);
        assertEquals(2,familyTest.countFamily());

    }
    @Test
    public void  deleteByReference(){    //After deleting, family member is 2
        familyTest.addChild(testChildTest2);
        familyTest.deleteChild(testChildTest2);
        assertEquals(2,familyTest.countFamily());

    }
    @Test
    public void testCount(){
        assertEquals(2,family1.countFamily());
    }
}
