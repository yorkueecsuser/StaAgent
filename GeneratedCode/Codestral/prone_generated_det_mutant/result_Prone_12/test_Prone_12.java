import org.junit.Test;
import static org.junit.Assert.*;

public class BadShiftAmountBugTest {

    @Test
    public void testBadShiftAmount() {
        BadShiftAmountBug buggyClass = new BadShiftAmountBug();
        int input = 4;
        int expectedOutput = 0; // Shifting by 32 is equivalent to shifting by 0

        // TRIGGER BUG: BadShiftAmount
        int actualOutput = buggyClass.showBug(input);

        assertEquals(expectedOutput, actualOutput);
    }
}