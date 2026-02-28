import org.junit.Test;
import static org.junit.Assert.*;

public class ConcurrentHashMapBugTest {
    @Test
    public void testShowBug() {
        ConcurrentHashMapBug buggyObject = new ConcurrentHashMapBug();
        buggyObject.showBug(); // TRIGGER BUG: UseConcurrentHashMap
    }
}