import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTest {
    @Test
    public void testEqualsSymmetry() {
        Fruit fruit = new Fruit("Green");
        Raspberry raspberry = new Raspberry("Red");

        // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
        // The bug is triggered here when a Raspberry object is compared with a Fruit object,
        // it returns false. But when a Fruit object is compared with a Raspberry object, it returns true.
        // This breaks the symmetry principle of the equals method.
        assertNotEquals(raspberry, fruit);
        assertEquals(fruit, raspberry);
    }
}