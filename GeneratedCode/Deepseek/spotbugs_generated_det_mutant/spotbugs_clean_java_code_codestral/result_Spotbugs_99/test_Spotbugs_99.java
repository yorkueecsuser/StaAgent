import org.junit.Test;
import static org.junit.Assert.*;

public class MyTestTest {

    private MyTest myTestInstance = new MyTest();

    @Test
    public void testShowBug() {
        myTestInstance.showBug(); // TRIGGER BUG: IJU: TestCase has no tests (IJU_NO_TESTS)
        fail("This test is expected to fail because MyTest has no test methods"); // Ensure the test fails
    }
}