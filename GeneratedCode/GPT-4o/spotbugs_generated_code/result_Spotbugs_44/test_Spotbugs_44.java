import org.junit.Test;
import static org.junit.Assert.*;

public class UnwrittenFieldExampleTest {

    @Test
    public void testShowBug() {
        UnwrittenFieldExample example = new UnwrittenFieldExample();
        example.showBug(); // TRIGGER BUG: NP: Read of unwritten field (NP_UNWRITTEN_FIELD)
    }
}