import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    public void testShowBug() {
        BuggyClass buggyObject = new BuggyClass(); // TRIGGER BUG: NoCanIgnoreReturnValueOnClasses
        buggyObject.showBug(); // Ignoring the returned object might lead to unexpected behavior.
        // The test will fail if @CheckReturnValue annotation is not present in the constructor of BuggyClass.
    }

}