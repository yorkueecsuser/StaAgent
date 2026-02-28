import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBugTest {

    @Test
    public void testSingletonBug() throws Exception {
        SingletonBug instance1 = SingletonBug.getInstance();
        instance1.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        SingletonBug instance2 = SingletonBug.getInstance();

        assertNotSame(instance1, instance2);
    }
}