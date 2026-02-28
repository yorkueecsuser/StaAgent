import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeBugTest {
    FinalizeBug fb = new FinalizeBug();

    @Test
    public void testFinalizeBug() {
        fb.showBug(); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
    }
}