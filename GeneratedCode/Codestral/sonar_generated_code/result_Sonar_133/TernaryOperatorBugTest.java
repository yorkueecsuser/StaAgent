import org.junit.Test;
import static org.junit.Assert.*;

public class TernaryOperatorBugTest {

    @Test
    public void showBugTest() {
        TernaryOperatorBug buggyClass = new TernaryOperatorBug();

        // TRIGGER BUG: Dissimilar primitive wrappers should not be used with the ternary operator without explicit casting
        float result = (float) buggyClass.showBug(true);

        assertEquals(10.0f, result, 0.01f);
    }
}