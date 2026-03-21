import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    // TRIGGER BUG: SING: Class using singleton design pattern indirectly implements Cloneable interface. (SING_SINGLETON_INDIRECTLY_IMPLEMENTS_CLONEABLE)
    public void testShowBug() {
        Singleton singleton = Singleton.getInstance();
        singleton.showBug();
    }
}