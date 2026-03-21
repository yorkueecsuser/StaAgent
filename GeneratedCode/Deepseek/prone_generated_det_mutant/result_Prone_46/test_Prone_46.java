import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNullBugTest {

    @Test
    public void testShowBug() {
        EqualsNullBug bug = new EqualsNullBug(null);
        
        // TRIGGER BUG: EqualsNull
        // This line is supposed to trigger the bug since equals() is called with null.
        // The equals() method should return false when called with null but instead it throws a NullPointerException.
        assertFalse(bug.showBug()); 
    }
}