import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testNonThreadSafeSingleton() throws Exception {
        SingletonExample example = SingletonExample.getInstance(); // TRIGGER BUG: NonThreadSafeSingleton
        example.showBug(10); // TRIGGER BUG: NonThreadSafeSingleton
    }
}