import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTest {

    @Test
    public void testEqualsSymmetryWithSubclass() {
        Season summer = new Season("Summer");
        Fruit fruit = new Fruit(summer);
        Raspberry raspberry = new Raspberry(summer, "Red");

        assertFalse(fruit.equals(raspberry)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
        assertTrue(raspberry.equals(fruit));  // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }

    @Test
    public void testShowBugMethod() {
        Season summer = new Season("Summer");
        Fruit fruit = new Fruit(summer);
        Raspberry raspberry = new Raspberry(summer, "Red");

        assertFalse(fruit.showBug(raspberry, summer)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }
}