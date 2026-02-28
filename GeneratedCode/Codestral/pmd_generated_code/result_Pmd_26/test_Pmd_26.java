import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCloneMethodTest {

    @Test
    public void testCloneMethodBug() {
        BuggyCloneMethod buggyObject = new BuggyCloneMethod();
        Object clonedObject = buggyObject.showBug(); // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
        assertSame(buggyObject.getClass(), clonedObject.getClass());
    }
}