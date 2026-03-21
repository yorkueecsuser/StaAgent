import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {
    @Test
    public void testSingleton() {
        SingletonExample instance1 = SingletonExample.getInstance();
        SingletonExample instance2 = new SingletonExample("Changed");

        // Test to ensure that instance1 and instance2 are not the same
        assertNotSame(instance1, instance2);

        // TRIGGER BUG: SING: Class using singleton design pattern has non-private constructor. (SING_SINGLETON_HAS_NONPRIVATE_CONSTRUCTOR)
    }
}