import org.junit.Test;
import static org.junit.Assert.*;

public class CatchThrowableExampleTest {

    @Test
    public void testShowBug() {
        CatchThrowableExample example = new CatchThrowableExample();
        example.showBug(); // TRIGGER BUG: AvoidCatchingThrowable
    }
}