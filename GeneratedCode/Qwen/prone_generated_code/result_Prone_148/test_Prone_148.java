import org.junit.Test;
import static org.junit.Assert.*;

public class SelfAssertionExampleTest {

    @Test
    public void testShowBug() {
        SelfAssertionExample example = new SelfAssertionExample();
        example.showBug(); // TRIGGER BUG: SelfAssertion
    }
}