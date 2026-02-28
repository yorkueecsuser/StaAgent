import org.junit.Test;
import static org.junit.Assert.*;

public class GuiceAssistedInjectScopingTest {

    @Test
    public void testBug() {
        GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
        assertEquals("SomeValue", obj.getValue());
    }

    @Test
    public void testBugWithAssistedInject() {
        GuiceAssistedInjectScoping obj = new GuiceAssistedInjectScoping();
        assertEquals("SomeValue", obj.getValue());
    }
}