import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTest {
    @Test
    public void testEqualsSymmetry() {
        Season ripe = new Season("Summer");
        Fruit fruit = new Fruit(ripe);
        Raspberry raspberry = new Raspberry(ripe, "Red");

        // Test for symmetry: a.equals(b) should be equal to b.equals(a)
        assertTrue(fruit.showBug(raspberry)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
        assertTrue(raspberry.showBug(fruit)); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }
}