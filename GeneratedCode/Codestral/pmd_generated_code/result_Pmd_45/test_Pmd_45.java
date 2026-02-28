import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizeOverloadedBugTest {
    @Test
    public void testFinalizeOverloadingBug() {
        FinalizeOverloadedBug bugObject = new FinalizeOverloadedBug();
        bugObject.showBug(); // TRIGGER BUG: FinalizeOverloaded

        // The test will fail here because the finalize(int a) method will not be called by the VM,
        // causing the system to not print "This method will not be called by the VM."
        // Thus, the test will fail to make the assertion.
    }
}