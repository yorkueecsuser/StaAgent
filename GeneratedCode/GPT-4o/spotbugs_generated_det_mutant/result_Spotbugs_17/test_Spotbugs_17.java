import org.junit.Test;
import static org.junit.Assert.*;

public class NullCheckExampleTest {

    @Test
    public void testShowBugWithNullFirstArgument() {
        NullCheckExample example = new NullCheckExample();
        example.showBug(null, "world!"); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    @Test
    public void testShowBugWithNullSecondArgument() {
        NullCheckExample example = new NullCheckExample();
        example.showBug("Hello", null); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }

    @Test
    public void testShowBugWithBothArgumentsNull() {
        NullCheckExample example = new NullCheckExample();
        example.showBug(null, null); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
    }
}