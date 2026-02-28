import org.junit.Test;
import static org.junit.Assert.*;

public class BufferSharingBugTest {

    @Test
    public void testBugTrigger() {
        // TRIGGER BUG: MS: May expose internal representation by returning a buffer sharing non-public data (MS_EXPOSE_BUF)
        BufferSharingBug.showBug();
    }
}