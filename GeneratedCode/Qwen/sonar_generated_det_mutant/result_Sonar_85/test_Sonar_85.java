import org.junit.Test;
import static org.junit.Assert.*;

public class StringBoundsBugTest {

    private StringBoundsBug stringBoundsBug = new StringBoundsBug();

    @Test
    public void testShowBug1() {
        stringBoundsBug.showBug1("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug2() {
        stringBoundsBug.showBug2("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug3() {
        stringBoundsBug.showBug3("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug4() {
        stringBoundsBug.showBug4("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}