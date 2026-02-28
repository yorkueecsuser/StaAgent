import org.junit.Test;
import static org.junit.Assert.*;

public class ExceptionNotThrownExampleTest {

    @Test
    public void testShowBugWithNegativeInput() {
        ExceptionNotThrownExample example = new ExceptionNotThrownExample();
        example.showBug(-5); // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN) 
    }
}