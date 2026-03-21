import org.junit.Test;
import static org.junit.Assert.*;

public class IncompatibleModifiersExampleTest {

    @Test
    public void testShowBug() {
        IncompatibleModifiersExample example = new IncompatibleModifiersExample();
        example.showBug(); // TRIGGER BUG: IncompatibleModifiers
    }
}