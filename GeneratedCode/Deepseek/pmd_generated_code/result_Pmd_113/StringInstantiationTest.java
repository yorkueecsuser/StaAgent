import static org.junit.Assert.*;
import org.junit.Test;

public class StringInstantiationTest {
    StringInstantiation stringInstantiation = new StringInstantiation();

    @Test
    public void testShowBug() {
        stringInstantiation.showBug(); // TRIGGER BUG: StringInstantiation
    }
}