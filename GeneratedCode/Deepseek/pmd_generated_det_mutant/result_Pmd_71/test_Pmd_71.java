import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test // TRIGGER BUG: SingletonClassReturningNewInstance
    public void testShowBug() {
        Singleton singleton = new Singleton();
        List<Singleton> instances = singleton.showBug();
        assertEquals(5, instances.size());
        for (int i = 0; i < 4; i++) {
            assertNotSame(instances.get(i), instances.get(i+1));
        }
    }
}