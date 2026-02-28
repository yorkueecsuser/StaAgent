import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExampleTest {

    @Test
    public void testShowBugWithNullArgument() {
        NullPointerExample example = new NullPointerExample();
        example.showBug(null); // TRIGGER BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }
}