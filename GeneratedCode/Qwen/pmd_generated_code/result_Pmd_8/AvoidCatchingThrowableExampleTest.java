import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidCatchingThrowableExampleTest {

    @Test
    public void testShowBugTriggersBug() {
        AvoidCatchingThrowableExample example = new AvoidCatchingThrowableExample();
        example.showBug(); // TRIGGER BUG: AvoidCatchingThrowable
    }
}