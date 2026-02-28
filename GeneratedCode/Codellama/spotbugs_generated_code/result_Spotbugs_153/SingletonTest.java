import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton clone = null;
        try {
            clone = (Singleton) singleton.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        assertNotNull(clone);
        assertNotSame(singleton, clone);
    }
}