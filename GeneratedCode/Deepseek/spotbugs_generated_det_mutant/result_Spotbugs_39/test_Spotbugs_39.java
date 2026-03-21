import org.junit.Test;
import static org.junit.Assert.*;

public class TestClassTest {

    @Test
    public void testShowBug() {
        TestClass testClass = new TestClass();
        testClass.showBug(); // TRIGGER BUG: Nm: Class defines equal(Object); should it be equals(Object)? (NM_BAD_EQUAL)
    }
}