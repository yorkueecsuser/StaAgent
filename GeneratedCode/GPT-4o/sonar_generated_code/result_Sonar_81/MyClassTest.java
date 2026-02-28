import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest {

    @Test
    public void testShowBug() {
        MyClass instance = new MyClass();
        instance.showBug(); // TRIGGER BUG: "getClass" should not be used for synchronization
        // This test will not fail with an assertion error but is used to demonstrate a potential synchronization issue
        // when using multiple threads. The output may vary, and race conditions may occur.
    }
}