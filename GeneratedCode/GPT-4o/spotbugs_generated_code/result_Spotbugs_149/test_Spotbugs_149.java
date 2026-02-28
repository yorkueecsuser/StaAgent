import org.junit.Test;
import static org.junit.Assert.*;

public class EndOfStreamBugDemoTest {

    @Test
    public void testShowBugWithFileContainingFF() {
        EndOfStreamBugDemo demo = new EndOfStreamBugDemo();
        demo.showBug("test_ff_file.txt"); // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
    }

    @Test
    public void testShowBugWithEmptyFile() {
        EndOfStreamBugDemo demo = new EndOfStreamBugDemo();
        demo.showBug("empty_file.txt"); // TRIGGER BUG: EOS: Data read is converted before comparison to -1 (EOS_BAD_END_OF_STREAM_CHECK)
    }
}