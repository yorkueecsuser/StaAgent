import org.junit.Test;
import static org.junit.Assert.*;

public class ThrowIfUncheckedExampleTest {

    @Test
    public void testShowBug() {
        ThrowIfUncheckedExample example = new ThrowIfUncheckedExample();
        example.showBug(); // TRIGGER BUG: ThrowIfUncheckedKnownChecked
    }
}