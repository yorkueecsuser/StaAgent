import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugExampleTest {

    @Test
    public void testShowBug() {
        FinalizeBugExample example = new FinalizeBugExample();
        example.showBug(); // TRIGGER BUG: AvoidCallingFinalize
    }
}