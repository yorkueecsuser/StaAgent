import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJExampleTest {

    @Test
    public void testShowBug() {
        AssertJExample example = new AssertJExample();
        example.showBug(); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}