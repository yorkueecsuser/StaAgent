import org.junit.Test;
import static org.junit.Assert.*;

public class RecursionExampleTest {

    @Test
    public void testShowBug() {
        RecursionExample example = new RecursionExample();
        // TRIGGER BUG: MUTUAL_RECURSION_CYCLE
        example.showBug(10); // This will cause a stack overflow if the input is large enough
    }
}