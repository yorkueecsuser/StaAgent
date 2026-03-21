import org.junit.Test;
import static org.junit.Assert.*;
import java.io.FileInputStream;
import java.io.IOException;

public class EOSBugTest {
    EOSBug eosBug = new EOSBug();

    @Test
    public void testShowBug() throws IOException {
        // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
        byte result = eosBug.showBug(); // This will trigger the bug
    }
}