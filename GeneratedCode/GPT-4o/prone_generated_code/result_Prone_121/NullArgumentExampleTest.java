import org.junit.Test;
import static org.junit.Assert.*;

public class NullArgumentExampleTest {

    @Test
    public void testShowBug() {
        NullArgumentExample example = new NullArgumentExample();
        example.showBug(); // TRIGGER BUG: NullArgumentForNonNullParameter
    }
}