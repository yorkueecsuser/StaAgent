import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeExampleTest {

    @Test
    public void testShowBug() {
        FinalizeExample example = new FinalizeExample();
        assertEquals("This method demonstrates the bug.", example.showBug()); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
    }
}