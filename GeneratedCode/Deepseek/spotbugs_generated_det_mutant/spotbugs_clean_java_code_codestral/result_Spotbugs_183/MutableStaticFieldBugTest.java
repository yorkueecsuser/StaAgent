import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldBugTest {

    @Test
    public void testModifyData() {
        String initialData = MutableStaticFieldBug.showBug();
        MutableStaticFieldBug.modifyData("New Data"); // TRIGGER BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
        String modifiedData = MutableStaticFieldBug.showBug();
        assertNotEquals(initialData, modifiedData); // The test should fail here, as the data has been modified
    }
}