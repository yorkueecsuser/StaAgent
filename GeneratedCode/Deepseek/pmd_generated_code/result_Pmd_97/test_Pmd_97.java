import org.junit.Test;
import static org.junit.Assert.*;

public class ConcurrentAppTest {
    @Test
    public void testGetMyInstance() {
        ConcurrentApp app = new ConcurrentApp();
        app.showBug();  // TRIGGER BUG: UseConcurrentHashMap
    }
}