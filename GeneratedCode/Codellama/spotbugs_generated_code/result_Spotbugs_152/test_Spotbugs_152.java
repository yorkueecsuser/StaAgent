import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testShowBug() {
        Singleton singleton = Singleton.getInstance();
        try {
            Singleton clone = (Singleton) singleton.clone();
            fail("Cloning should not be allowed"); // TRIGGER BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
        } catch (CloneNotSupportedException e) {
            // Expected exception thrown
        }
    }
}