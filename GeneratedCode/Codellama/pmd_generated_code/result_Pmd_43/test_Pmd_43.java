import org.junit.Test;
import static org.junit.Assert.*;

public class BugsTest {
    @Test
    public void testFinalizeDoesNotCallSuperFinalize() {
        Bugs bugs = new Bugs();
        // TRIGGER BUG: FinalizeDoesNotCallSuperFinalize
        bugs.showBug();
        // The finalize() method does not call super.finalize()
        // This is a violation of the Java API specification
        // and can lead to unexpected behavior
    }
}