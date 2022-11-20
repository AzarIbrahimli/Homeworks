package homework12.test;

import homework12.gender.Man;
import homework12.gender.Woman;
import homework12.model.Family;
import homework12.model.Human;
import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Tester {
        Human mother = new Woman("Malahat","Ibrahimli");
        Human father = new Man("Abdurahim","Ibrahimli");
        Family family = new Family(mother,father);

        Tester() throws ParseException {
        }

        @Test
        public void testAdd() throws ParseException {
                Human child = new Man("Azar","Ibrahimli");
                family.addChild(child);
                assertEquals(family.getChild(0),child);
                assertEquals(family.getChildren().size(),1);
        }

        @Test
        public void testDeleteByIndex() throws ParseException {
                family.addChild(new Man("Azar","Ibrahimli"));
                family.deleteChild(0);
                assertEquals(family.getChildren().size(),0);
        }

        @Test
        public void testDeleteByReference() throws ParseException {
                family.addChild(new Man("Azar","Ibrahimli"));
                family.deleteChild(new Man("Azar","Ibrahimli"));
                assertEquals(family.getChildren().size(),0);
        }

        @Test
        public void testCount(){
                assertEquals(family.countFamily(),2);
        }

        @Test
        public void getByIndex() throws ParseException {
                Human child1 = new Man("Azar","Ibrahimli");
                Human child2 = new Man("Azaz","Ibrahimli");
                Human child3 = new Man("Azazz","Ibrahimli");
                family.addChild(child1);
                family.addChild(child2);
                family.addChild(child3);
                assertEquals(child1,family.getChild(0));
                assertEquals(child2,family.getChild(1));
                assertEquals(child3,family.getChild(2));
        }
}
