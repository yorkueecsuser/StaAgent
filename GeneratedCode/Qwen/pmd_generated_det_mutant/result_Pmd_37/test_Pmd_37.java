import org.junit.Test;
import static org.junit.Assert.*;

public class FinallyBlockExceptionTest {

    @Test
    public void testShowBugTriggersException() {
        FinallyBlockException example = new FinallyBlockException();
        example.showBug(); // TRIGGER BUG: DoNotThrowExceptionInFinally
    }
}