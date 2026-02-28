import org.junit.Test;
import static org.junit.Assert.*;

public class StringInstantiationBugTest {

    @Test
    public void testStringInstantiationBug() {
        StringInstantiationBug bug = new StringInstantiationBug();
        String expected = "bar";
        String actual = bug.showBug();
        // TRIGGER BUG: StringInstantiation
        assertNotSame(expected, actual);
    }
}