import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    Main main = new Main();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: TQ: Value that might carry a type qualifier is always used in a way prohibits it from having that type qualifier (TQ_MAYBE_SOURCE_VALUE_REACHES_NEVER_SINK)
        main.showBug();
    }
}