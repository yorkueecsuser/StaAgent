import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

class AbsNegationBugDemoTest {

    @Test
    public void testShowBug() {
        AbsNegationBugDemo demo = new AbsNegationBugDemo();
        int result = demo.showBug(0x80000000); // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertFalse("The result should not be Integer.MIN_VALUE", result == Integer.MIN_VALUE);
    }
}