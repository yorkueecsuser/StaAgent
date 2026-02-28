import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryInstanceofExampleTest {

    @Test
    public void testShowBugWithDog() {
        UnnecessaryInstanceofExample example = new UnnecessaryInstanceofExample();
        UnnecessaryInstanceofExample.Animal animal = new UnnecessaryInstanceofExample.Dog();
        int result = example.showBug(animal); // TRIGGER BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        assertEquals(1, result);
    }

    @Test
    public void testShowBugWithAnimal() {
        UnnecessaryInstanceofExample example = new UnnecessaryInstanceofExample();
        UnnecessaryInstanceofExample.Animal animal = new UnnecessaryInstanceofExample.Animal();
        int result = example.showBug(animal); // TRIGGER BUG: SIO: Unnecessary type check done using instanceof operator (SIO_SUPERFLUOUS_INSTANCEOF)
        assertEquals(0, result);
    }
}