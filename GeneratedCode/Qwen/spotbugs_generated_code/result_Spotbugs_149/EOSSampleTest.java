import org.junit.Test;
import static org.junit.Assert.*;

public class EOSSampleTest {

    @Test
    public void testShowBugWithFFByte() {
        EOSSample sample = new EOSSample();
        sample.showBug("testFileWithFF.txt"); // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
    }
}