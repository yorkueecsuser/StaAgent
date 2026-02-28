import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBug() {
        StringBufferBugExample example = new StringBufferBugExample();
        String result = example.showBug(); // TRIGGER BUG: InsufficientStringBufferDeclaration
        assertEquals("This is a long string that will exceed the default 16 characters", result); // This line will fail indicating the bug
    }
    
    @Test
    public void testShowGoodExample() {
        StringBufferBugExample example = new StringBufferBugExample();
        String result = example.showGoodExample();
        assertEquals("This is a long string, which is pre-sized", result);
    }
}