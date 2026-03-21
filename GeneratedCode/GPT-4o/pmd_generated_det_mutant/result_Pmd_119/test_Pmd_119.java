import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexCheckerTest {

    @Test
    public void testShowBug() {
        StringIndexChecker checker = new StringIndexChecker();
        
        // Test case where the bug is triggered
        int result = checker.showBug("hello world", "d"); // TRIGGER BUG: UseIndexOfChar
        assertEquals(10, result);
    }
    
    @Test
    public void testShowBugWithNonExistingChar() {
        StringIndexChecker checker = new StringIndexChecker();
        
        // Test case where the bug is triggered, should return -1
        int result = checker.showBug("hello world", "z"); // TRIGGER BUG: UseIndexOfChar
        assertEquals(-1, result);
    }
}