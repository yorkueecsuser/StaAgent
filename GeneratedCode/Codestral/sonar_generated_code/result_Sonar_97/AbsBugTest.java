import org.junit.Test;
import static org.junit.Assert.*;

public class AbsBugTest {
    @Test
    public void testShowBug_MinValue() {
        AbsBug absBug = new AbsBug();
        String str = new String(new char[0]); // String with hash code Integer.MIN_VALUE
        int result = absBug.showBug(str);
        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MIN_VALUE, result); // This assertion fails because the result should be -Integer.MIN_VALUE
    }
}