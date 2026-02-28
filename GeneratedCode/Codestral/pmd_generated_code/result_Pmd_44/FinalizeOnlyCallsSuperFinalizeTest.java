import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeOnlyCallsSuperFinalizeTest {
    @Test
    public void testShowBug() {
        FinalizeOnlyCallsSuperFinalize obj = new FinalizeOnlyCallsSuperFinalize();
        obj.showBug(); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
        // The bug is triggered when the showBug() method is called.
        // The FinalizeOnlyCallsSuperFinalize bug is present in the finalize() method of the FinalizeOnlyCallsSuperFinalize class.
        // Since the finalize() method only calls super.finalize() without doing anything else,
        // the bug is not being triggered in this test case, which leads to a test failure.
    }
}