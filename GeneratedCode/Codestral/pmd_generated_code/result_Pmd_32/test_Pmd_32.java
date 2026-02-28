import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass myClass = new MyClass();
        myClass.showBug(); // TRIGGER BUG: DetachedTestCase
        // The bug is triggered because the someMethod() is not annotated with @Test,
        // and it is called in the showBug() method which is not a test case itself.
        // Therefore, the someMethod() is not recognized as a test case by JUnit,
        // causing the test to fail.
    }
}