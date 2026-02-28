import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionAccessibilityExampleTest {

    @Test
    public void testShowBug() {
        ReflectionAccessibilityExample example = new ReflectionAccessibilityExample();
        String result = example.showBug(); // TRIGGER BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD)
        assertEquals("NotSoSecret", result); // The test should fail as this triggers the bug
    }
}