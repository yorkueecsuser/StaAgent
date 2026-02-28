import org.junit.Test;
import static org.junit.Assert.*;

public class MutableObjectExposerTest {

    @Test
    public void testShowBug() {
        int[] initialArray = {1, 2, 3};
        MutableObjectExposer exposer = new MutableObjectExposer(initialArray);

        // Call showBug to expose the internal array
        int[] exposedArray = exposer.showBug();

        // Modify the exposed array
        exposedArray[0] = 99; // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)

        // Assert that the original internal array has been altered, which it shouldn't be
        assertEquals(1, exposer.showBug()[0]); // TRIGGER BUG: EI: May expose internal representation by returning reference to mutable object (EI_EXPOSE_REP)
    }
}