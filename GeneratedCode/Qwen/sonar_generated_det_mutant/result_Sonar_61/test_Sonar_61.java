import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testSetFieldOneAndGetFieldTwo() {
        BuggyClass buggyObject = new BuggyClass();
        buggyObject.setFieldOne(10); // TRIGGER BUG: Getters and setters should access the expected fields
        assertEquals(10, buggyObject.getFieldTwo()); // TRIGGER BUG: Getters and setters should access the expected fields
    }

    @Test
    public void testShowBug() {
        BuggyClass buggyObject = new BuggyClass();
        buggyObject.showBug(); // TRIGGER BUG: Getters and setters should access the expected fields
    }
}