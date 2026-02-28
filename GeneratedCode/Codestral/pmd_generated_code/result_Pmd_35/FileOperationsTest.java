import org.junit.Test;
import static org.junit.Assert.*;
import java.io.File;

public class FileOperationsTest {
    private static final String INCORRECT_STORAGE_LOCATION = "/sdcard/mypackage";

    @Test
    public void testCreateDirectory() {
        FileOperations fileOperations = new FileOperations();
        fileOperations.showBug();

        File directory = new File(INCORRECT_STORAGE_LOCATION);
        assertTrue("The directory should have been created", directory.exists()); // TRIGGER BUG: DoNotHardCodeSDCard
    }
}