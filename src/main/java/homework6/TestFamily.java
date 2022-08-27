package homework6;
import  org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFamily {
    Pet pet = new Pet(Species.Cat,"Mastan", 2, 20, new String[]{"eat,drink,sleep"});
    Human mother = new Human("Jane","Karleone",1956,95,new String[][]{{Human.name(DayOfWeek.Monday), "study"}});
    Human father = new Human("Vito","Karleone",1955,90,new String[][]{{Human.name(DayOfWeek.Monday), "go to cinema"}});
    Human child = new Human("Victor","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Human child2 = new Human("Rodrigues","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Human testchild3 = new Human("Rodrigo","Karleone",1980,99, new String[][]{{Human.name(DayOfWeek.Tuesday), "play"}});
    Family family = new Family(father,mother,pet,new ArrayList<>());



    @Test
    public void testAdd(){
        family.addChild(child);
        assertEquals(3,family.countFamily());
    }
    @Test
    public void  OutofBounds(){         // remains unchanged if you pass an index outside the index range
        family.addChild(child2);
        family.deleteChild(10);
        assertEquals(3,family.countFamily());

    }
    @Test
    public void  deleteByIndex(){        //After deleting, family member is 2
        family.addChild(child2);
        family.deleteChild(0);
        assertEquals(2,family.countFamily());

    }

    @Test
    public void  deleteByReference(){    //After deleting, family member is 2
        family.addChild(child2);
        family.deleteChild(child2);
        assertEquals(2,family.countFamily());
    }
    @Test
    public void  ObjIsNotEQual(){    //remains unchanged
        family.deleteChild(testchild3);
        assertEquals(2,family.countFamily());
    }
    @Test
    public void testCount(){
        assertEquals(2,family.countFamily());
    }
}
