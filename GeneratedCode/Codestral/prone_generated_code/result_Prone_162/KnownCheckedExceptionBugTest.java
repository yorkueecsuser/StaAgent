import org.junit.Test;
import static org.junit.Assert.*;

public class KnownCheckedExceptionBugTest {

    @Test
    public void testShowBug() throws Exception {
        KnownCheckedExceptionBug bug = new KnownCheckedExceptionBug();
        bug.showBug(); // TRIGGER BUG: ThrowIfUncheckedKnownChecked
        fail("Expected exception not thrown"); // As the exception is not thrown by the buggy methods, this line will be executed and the test will fail
    }
}