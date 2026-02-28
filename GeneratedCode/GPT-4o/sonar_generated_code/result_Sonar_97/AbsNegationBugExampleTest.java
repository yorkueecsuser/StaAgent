import org.junit.Test;
import static org.junit.Assert.*;

public class AbsNegationBugExampleTest {

    @Test
    public void testShowBugWithMinValue() {
        AbsNegationBugExample example = new AbsNegationBugExample();
        int result = example.showBug(0); // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
        assertNotEquals("The result should not be Integer.MIN_VALUE", Integer.MIN_VALUE, result);
    }
}