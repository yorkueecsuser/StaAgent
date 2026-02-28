import org.junit.Test;
import static org.junit.Assert.*;

public class ExampleBugTest {

    @Test
    public void testShowBug() {
        ExampleBug example = new ExampleBug();
        example.showBug(); // TRIGGER BUG: IJU: JUnit assertion in run method will not be noticed by JUnit (IJU_ASSERT_METHOD_INVOKED_FROM_RUN_METHOD)
    }
}