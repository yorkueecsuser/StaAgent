import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SideEffectInAssertTest {

    @Test
    public void testShowBug() {
        List<String> myList = new ArrayList<>();
        myList.add("Element1");
        myList.add("Element2");

        SideEffectInAssert demo = new SideEffectInAssert();
        
        // This will trigger the bug because assertions are not enabled by default, 
        // so the side effect of removing an element won't occur.
        boolean result = demo.showBug(myList); // TRIGGER BUG: Expressions used in "assert" should not produce side effects
        assertFalse("The list should not be empty if assertions are not enabled.", result);
    }
}