import org.junit.Test;
import static org.junit.Assert.*;

public class PreconditionsExampleTest {

    @Test
    public void testShowBug() {
        PreconditionsExample example = new PreconditionsExample();
        example.showBug(17); // TRIGGER BUG: PreconditionsInvalidPlaceholder
    }
}