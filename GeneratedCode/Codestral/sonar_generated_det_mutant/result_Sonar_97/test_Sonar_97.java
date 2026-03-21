import org.junit.Test;
import static org.junit.Assert.*;

public class AbsMinValueBugTest {
    @Test
    public void testShowBug() {
        AbsMinValueBug bug = new AbsMinValueBug();
        int result = bug.showBug(Integer.MIN_VALUE);  // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals("Bug should return the correct value for Integer.MIN_VALUE", Integer.MAX_VALUE, result);
    }
}