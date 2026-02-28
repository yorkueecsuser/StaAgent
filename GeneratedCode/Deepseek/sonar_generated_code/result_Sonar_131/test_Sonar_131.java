import org.junit.Test;
import static org.junit.Assert.*;

public class FruitTest {
    @Test
    public void testEqualsSymmetricity() {
        Fruit fruit = new Fruit();
        assertTrue(fruit.equals(new Fruit())); // TRIGGER BUG: "equals" methods should be symmetric and work for subclasses
    }
}