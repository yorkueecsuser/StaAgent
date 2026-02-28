import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass myClass = new MyClass(10);
        try {
            myClass.showBug(); // TRIGGER BUG: CloneMethodMustImplementCloneable
        } catch (CloneNotSupportedException e) {
            // This catch block is necessary to compile, but the test will fail because the exception is not expected to be caught
            fail("CloneNotSupportedException was thrown unexpectedly");
        }
    }
}