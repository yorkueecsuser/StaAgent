import org.junit.Test;
import static org.junit.Assert.*;

public class MathAbsBugDemoTest {

    @Test
    public void testShowBugWithMinValue() {
        MathAbsBugDemo demo = new MathAbsBugDemo();
        int result = demo.showBug(); // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertEquals(Integer.MAX_VALUE, result); // This will fail because Math.abs(Integer.MIN_VALUE) returns Integer.MIN_VALUE, not Integer.MAX_VALUE
    }
}