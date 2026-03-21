import org.junit.Test;
import static org.junit.Assert.*;

public class GuardedByViolationExampleTest {

    @Test
    public void testShowBug() {
        GuardedByViolationExample example = new GuardedByViolationExample();
        String inputData = "newData";
        String result = example.showBug(inputData); // TRIGGER BUG: GUARDEDBY_VIOLATION
        assertEquals(inputData, result); // TRIGGER BUG: GUARDEDBY_VIOLATION
    }
}