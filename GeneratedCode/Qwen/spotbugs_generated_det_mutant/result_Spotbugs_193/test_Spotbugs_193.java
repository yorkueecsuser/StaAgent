import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugExampleTest {

    @Test
    public void testMakeFieldAccessibleTriggersBug() throws NoSuchFieldException, IllegalAccessException {
        ReflectionBugExample example = new ReflectionBugExample();
        int secret = example.showBug(); // TRIGGER BUG: REFLF: Public method uses reflection to modify a field it gets in its parameter which could increase the accessibility of any class (REFLF_REFLECTION_MAY_INCREASE_ACCESSIBILITY_OF_FIELD) 
        assertEquals(42, secret);
    }
}