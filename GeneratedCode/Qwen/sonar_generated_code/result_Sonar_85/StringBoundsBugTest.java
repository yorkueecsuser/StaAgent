import org.junit.Test;
import static org.junit.Assert.*;

public class StringBoundsBugTest {

    private StringBoundsBug bug = new StringBoundsBug();

    @Test
    public void testShowBug1() {
        bug.showBug1("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug2() {
        bug.showBug2("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug3() {
        bug.showBug3("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }

    @Test
    public void testShowBug4() {
        bug.showBug4("test"); // TRIGGER BUG: Indexes to passed to "String" operations should be within the string's bounds
    }
}