import org.junit.Test;
import static org.junit.Assert.*;

public class CompareToBugTest {

    @Test
    public void testShowBug() {
        CompareToBug buggyClass = new CompareToBug();

        Integer a = 2;
        Integer b = 1;

        // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        assertEquals("a is greater than b", buggyClass.showBug(a, b));

        a = 0;
        b = 0;

        assertEquals("a and b are equal", buggyClass.showBug(a, b));

        a = -1;
        b = -2;

        // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
        assertEquals("a is less than b", buggyClass.showBug(a, b));
    }
}