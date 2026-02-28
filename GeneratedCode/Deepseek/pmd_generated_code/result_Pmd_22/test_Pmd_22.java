import org.junit.Test;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import static org.junit.Assert.*;

public class BugCheckSkipResultTest {

    private BugCheckSkipResult bugCheckSkipResult;

    // Setup method
    public void setUp() throws IOException {
         bugCheckSkipResult = new BugCheckSkipResult();
    }

    @Test
    // TRIGGER BUG: CheckSkipResult
    public void testShowBug() throws IOException {
        // TRIGGER BUG: CheckSkipResult
        bugCheckSkipResult.showBug(); 
    }

    @Test
    // TRIGGER BUG: CheckSkipResult
    public void testShowBugExactly() throws IOException {
        // TRIGGER BUG: CheckSkipResult
        bugCheckSkipResult.showBugExactly(); 
    }
}