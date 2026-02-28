import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizedGetterSetterExampleTest {

    @Test
    public void testShowBug() {
        SynchronizedGetterSetterExample example = new SynchronizedGetterSetterExample();
        
        example.showBug(); // TRIGGER BUG: Getters and setters should be synchronized in pairs

        // The test is expected to fail because of the unsynchronized access to sharedResource in getSharedResource method.
        // Since the failure can result in inconsistent reads of sharedResource, an assert here may not catch the exact failure point,
        // but the race condition should be evident in the output inconsistencies or errors.
    }
}