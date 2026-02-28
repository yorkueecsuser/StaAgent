import org.junit.Test;
import static org.junit.Assert.*;

public class StringInstantiationBugTest {

    @Test
    public void testShowBug() {
        StringInstantiationBug bugDemo = new StringInstantiationBug();
        assertEquals("bar", bugDemo.showBug()); // TRIGGER BUG: StringInstantiation
    }
}