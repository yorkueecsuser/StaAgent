import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug() throws CloneNotSupportedException { // TRIGGER BUG: CloneMethodMustBePublic
        BuggyClass buggyObject = new BuggyClass(10);
        buggyObject.showBug();
    }
}