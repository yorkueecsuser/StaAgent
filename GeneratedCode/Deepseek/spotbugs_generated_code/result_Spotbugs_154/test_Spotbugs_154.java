import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingletonPattern() {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // TRIGGER BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
        Singleton obj3 = new Singleton();

        assertNotEquals(obj1, obj3);
        assertNotEquals(obj2, obj3);
    }

    @Test
    public void testShowBug() {
        Singleton singleton = Singleton.getInstance();
        singleton.showBug();
        // The test will fail as the showBug method creates two new instances of Singleton,
        // which should not be possible if the constructor was private.
    }
}