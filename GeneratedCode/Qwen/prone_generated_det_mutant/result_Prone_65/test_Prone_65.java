import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceExampleTest {

    @Test
    public void testGuiceInjectionOnFinalField() {
        GuiceExample example = new GuiceExample();
        assertNull(example.showBug()); // TRIGGER BUG: GuiceInjectOnFinalField
    }
}