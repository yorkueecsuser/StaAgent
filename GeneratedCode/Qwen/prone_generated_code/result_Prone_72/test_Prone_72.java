import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleArgumentTypeExampleTest {

    @Test
    public void testShowBugWithNumberContainer() {
        IncompatibleArgumentTypeExample example = new IncompatibleArgumentTypeExample();
        NumberContainer numberContainer = new NumberContainer();
        assertFalse(example.showBug(numberContainer)); // TRIGGER BUG: IncompatibleArgumentType
    }
}