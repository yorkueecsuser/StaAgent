import org.junit.Test;
import static org.junit.Assert.*;

public class IdenticalExpressionsBugTest {

    @Test
    public void testShowBug() {
        IdenticalExpressionsBug buggyCode = new IdenticalExpressionsBug();
        assertFalse(buggyCode.showBug(5, 6)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug2() {
        IdenticalExpressionsBug buggyCode = new IdenticalExpressionsBug();
        assertEquals(0, buggyCode.showBug2(5)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }

    @Test
    public void testShowBug3() {
        Object obj = new Object();
        IdenticalExpressionsBug buggyCode = new IdenticalExpressionsBug();
        assertTrue(buggyCode.showBug3(obj)); // TRIGGER BUG: Identical expressions should not be used on both sides of a binary operator
    }
}