import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionBugExampleTest {

    @Test
    public void testShowBugTrigger() {
        AssertionBugExample.MyClass obj = new AssertionBugExample.MyClass("test");
        AssertionBugExample example = new AssertionBugExample();
        
        // TRIGGER BUG: Assertions should not compare an object to itself
        boolean result = example.showBug(obj); 
        assertFalse("The method should not return true when comparing an object to itself", result);
    }
}