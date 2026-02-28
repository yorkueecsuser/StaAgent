import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerExceptionExampleTest {

    @Test
    public void testShowBugWithNullInput() {
        NullPointerExceptionExample example = new NullPointerExceptionExample();
        example.showBug(null); // TRIGGER BUG: AvoidCatchingNPE
    }
}