import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCloneImplementationTest {
    @Test
    public void testShowBug() {
        BuggyCloneImplementation buggyObject = new BuggyCloneImplementation(5);
        buggyObject.showBug(); // TRIGGER BUG: ProperCloneImplementation
        buggyObject.value = 10;
        buggyObject.showBug(); // TRIGGER BUG: ProperCloneImplementation
        assertNotEquals("Cloned object value should not be equal to the original object value", buggyObject.value, ((BuggyCloneImplementation) buggyObject.clone()).value);
    }
}