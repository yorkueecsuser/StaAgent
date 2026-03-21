import static org.junit.Assert.*;
import org.junit.Test;
import java.io.*;

public class EOS_BAD_END_OF_STREAM_CHECKTest {
    // Test data
    private final String testFile = "example.txt";

    @Test
    public void testEOS_BAD_END_OF_STREAM_CHECK() throws Exception {
        FileInputStream fis = new FileInputStream(testFile);
        FileReader fr = new FileReader(testFile);

        int read;
        while ((read = fis.read())!= -1) { // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }

        while ((read = fr.read())!= -1) { // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
            System.out.println((char) read);
        }
    }
}