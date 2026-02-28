import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionAccessibilityTest {

    @Test
    public void testTriggerBugWithSomeClass() {
        ReflectionAccessibility refAcc = new ReflectionAccessibility();
        // TRIGGER BUG: REFLC: Public method uses reflection to create a class it gets in its parameter which could increase the accessibility of any class (REFLC_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_CLASS)
        refAcc.showBug(SomeClass.class);
    }
}