import org.junit.Test;
import static org.junit.Assert.*;

public class StringOperationsBugTest {

    private StringOperationsBug bugDemo = new StringOperationsBug();

    @Test
    public void testShowBug1() {
        assertTrue(bugDemo.showBug1("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug2() {
        assertTrue(bugDemo.showBug2("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug3() {
        assertTrue(bugDemo.showBug3("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug4() {
        assertEquals("example", bugDemo.showBug4("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug5() {
        assertEquals("", bugDemo.showBug5("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug6() {
        assertEquals("example", bugDemo.showBug6("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }

    @Test
    public void testShowBug7() {
        assertEquals("example", bugDemo.showBug7("example")); // TRIGGER BUG: String operations with predictable outcomes should be avoided
    }
}