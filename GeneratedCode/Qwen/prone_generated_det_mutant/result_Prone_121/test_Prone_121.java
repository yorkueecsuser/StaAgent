import org.junit.Test;
import static org.junit.Assert.*;

public class NullArgumentExampleTest {

    @Test
    public void testShowBugWithNull() {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug(null); // TRIGGER BUG: NullArgumentForNonNullParameter
    }
}