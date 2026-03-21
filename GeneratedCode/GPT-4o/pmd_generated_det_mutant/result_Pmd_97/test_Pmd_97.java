import org.junit.Test;
import static org.junit.Assert.*;

public class MultiThreadedMapExampleTest {

    @Test
    public void testShowBugTriggersUseConcurrentHashMap() {
        MultiThreadedMapExample example = new MultiThreadedMapExample();
        example.showBug(new String[]{"apple", "banana", "apple", "orange", "banana", "apple"}); // TRIGGER BUG: UseConcurrentHashMap
    }
}