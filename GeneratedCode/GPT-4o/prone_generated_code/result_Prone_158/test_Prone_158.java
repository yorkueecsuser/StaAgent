import org.junit.Test;
import static org.junit.Assert.*;

public class DeprecatedWarningExampleTest {

    @Test
    public void testShowBug() {
        DeprecatedWarningExample example = new DeprecatedWarningExample();
        example.showBug(); // TRIGGER BUG: SuppressWarningsDeprecated
    }
}