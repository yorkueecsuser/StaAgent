import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugTest {
    @Test
    public void showBug_shouldThrowNullPointerException_whenMessageIsNull() {
        NullPointerBug bug = new NullPointerBug();

        // TRIGGER BUG: Null pointers should not be dereferenced
        bug.showBug();
    }
}