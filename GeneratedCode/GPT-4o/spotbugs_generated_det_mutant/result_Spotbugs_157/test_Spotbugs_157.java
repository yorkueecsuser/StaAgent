import org.junit.Test;
import static org.junit.Assert.*;

public class MethodHidingExampleTest {

    @Test
    public void testShowBug() {
        MethodHidingExample example = new MethodHidingExample();
        String result = example.showBug(); // TRIGGER BUG: HSM: Method hiding should be avoided. (HSM_HIDING_METHOD)

        // The expected behavior should be consistent regardless of the class instance.
        // This test fails because the method hiding causes different outputs when calling the display method.
        assertEquals("Displaying from ParentClass\nDisplaying from ParentClass\nBug demonstrated: Method hiding occurred", result);
    }
}