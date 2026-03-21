import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationsBugDemoTest {

    @Test
    public void testShowBug1() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        String result = demo.showBug1("test"); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertEquals("String does not contain itself!", result); // The bug causes this assertion to fail
    }

    @Test
    public void testShowBug2() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        boolean result = demo.showBug2("test"); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertFalse(result); // The bug causes this assertion to fail
    }

    @Test
    public void testShowBug3() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        boolean result = demo.showBug3("test"); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertFalse(result); // The bug causes this assertion to fail
    }

    @Test
    public void testShowBug4() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        String result = demo.showBug4("test"); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertEquals("", result); // The bug causes this assertion to fail
    }

    @Test
    public void testShowBug5() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        String result = demo.showBug5("test"); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertEquals("", result); // The bug causes this assertion to fail
    }

    @Test
    public void testShowBug6() {
        StringOperationsBugDemo demo = new StringOperationsBugDemo();
        String result = demo.showBug6("This is an example."); // TRIGGER BUG: String operations with predictable outcomes should be avoided
        assertEquals("This is an ", result); // The bug causes this assertion to fail
    }
}