import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadExampleTest {

    @Test
    public void testMyThreadDoesNotRun() {
        MyThreadExample example = new MyThreadExample();
        String result = example.showBug(); // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        assertEquals("This test will fail because MyThread does not override the run method", "Hello, World!", result);
    }
}