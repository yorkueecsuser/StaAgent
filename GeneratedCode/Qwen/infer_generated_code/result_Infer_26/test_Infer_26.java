import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ImpureFunctionExampleTest {

    @Test
    public void testMakeAllZero_impure() {
        ImpureFunctionExample example = new ImpureFunctionExample();
        ArrayList<Integer> result = example.showBug(); // TRIGGER BUG: IMPURE_FUNCTION
        assertEquals("[1, 2, 3]", result.toString()); // This assertion will fail, demonstrating the bug
    }
}