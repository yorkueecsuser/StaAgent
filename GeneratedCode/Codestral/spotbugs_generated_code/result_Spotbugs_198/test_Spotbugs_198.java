import org.junit.Test;
import java.io.File;
import java.io.IOException;
import static org.junit.Assert.*;

public class UntrustedSourceBugTest {
    @Test
    public void testProcessFile() throws IOException {
        File tempFile = File.createTempFile("temp", ".txt");
        tempFile.deleteOnExit();

        UntrustedSourceBug buggyClass = new UntrustedSourceBug();

        // Modify the file before processing
        tempFile.renameTo(new File(tempFile.getParent(), "modifiedTemp.txt"));

        // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
        buggyClass.showBug(tempFile);

        // The test should fail at this point as the file has been modified and the delete operation should throw an exception
        assertFalse(tempFile.exists());
    }
}