import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsTesterBugTest {
    @Test(expected = NoSuchMethodError.class)
    public void testStringBug() {
        EqualsTesterBug buggyClass = new EqualsTesterBug();
        buggyClass.showBug(); // TRIGGER BUG: MissingTestCall
    }
}