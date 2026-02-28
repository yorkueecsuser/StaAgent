import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeOnlyCallsSuperFinalizeTest {
    @Test
    public void testBugTrigger() {
        FinalizeOnlyCallsSuperFinalize fo = new FinalizeOnlyCallsSuperFinalize("John", 30);
        fo.showBug(); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
    }

    @Test
    public void testBugTriggerWithoutFinalize() {
        FinalizeOnlyCallsSuperFinalize fo = new FinalizeOnlyCallsSuperFinalize("John", 30);
        fo.showBug(); // TRIGGER BUG: FinalizeOnlyCallsSuperFinalize
    }

    public void runTest() {
        testBugTrigger();
        testBugTriggerWithoutFinalize();
    }
}