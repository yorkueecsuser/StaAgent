import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugTest {

    @Test
    public void testShowBug() throws InstantiationException, IllegalAccessException {
        ReflectionBug rb = new ReflectionBug();
        // TRIGGER BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
        rb.showBug(PrivateClass.class);
    }

    // Private class to test reflection bug
    private static class PrivateClass {
        private PrivateClass() {}
    }
}