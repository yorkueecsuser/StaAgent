import org.junit.Test;
import static org.junit.Assert.*;

public class AnimalTest {
    @Test
    public void testAutoValueConstructorOrderChecker() {
        // TRIGGER BUG: AutoValueConstructorOrderChecker
        Animal animal = Animal.create("dog", 4);
        assertEquals("dog", animal.name());
        assertEquals(4, animal.numberOfLegs());
    }
}