import org.junit.Test;
import static org.junit.Assert.*;

public class ResourceManagementExampleTest {

    @Test
    public void testShowBugTriggersMustBeClosedChecker() {
        ResourceManagementExample example = new ResourceManagementExample();
        String result = example.showBug("dummyFilePath"); // TRIGGER BUG: MustBeClosedChecker
        assertNotNull(result);
    }
}