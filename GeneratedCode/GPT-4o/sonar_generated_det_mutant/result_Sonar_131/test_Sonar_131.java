import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTest {

    @Test
    public void testSymmetryViolation() {
        Fruit fruit = new Fruit(new Season("Summer"));
        Raspberry raspberry = new Raspberry(new Season("Summer"));
        
        // Check symmetry of equals method
        assertTrue(fruit.equals(raspberry)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
        assertTrue(raspberry.equals(fruit)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }
    
    @Test
    public void testShowBugMethod() {
        Fruit fruit = new Fruit(new Season("Summer"));
        assertFalse(fruit.showBug()); // This should be false if the bug is present
    }
}