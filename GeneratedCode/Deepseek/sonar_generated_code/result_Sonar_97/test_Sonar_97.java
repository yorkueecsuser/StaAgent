import org.junit.Test;
import static org.junit.Assert.*;

public class MathAbsNegationBugTest {

    @Test
    public void testShowBug() {
        MathAbsNegationBug buggyCode = new MathAbsNegationBug();
        buggyCode.showBug(); // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}