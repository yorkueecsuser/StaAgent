import org.junit.Test;
import static org.junit.Assert.*;

public class SampleClassTest {

    @Test
    public void testShowBug() {
        SampleClass sample = new SampleClass();
        sample.setUp(); // TRIGGER BUG: IJU: TestCase defines setUp that doesn’t call super.setUp() (IJU_SETUP_NO_SUPER)
        assertEquals(1, sample.showBug());
    }
}