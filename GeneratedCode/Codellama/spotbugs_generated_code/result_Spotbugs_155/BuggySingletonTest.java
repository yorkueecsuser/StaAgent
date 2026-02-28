import org.junit.Test;
import static org.junit.Assert.*;

public class BuggySingletonTest {
    @Test
    public void testSingleton() {
        // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        BuggySingleton instance1 = BuggySingleton.getInstance();
        BuggySingleton instance2 = BuggySingleton.getInstance();
        assertSame(instance1, instance2);
    }

    @Test
    public void testSerialization() {
        // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)
        BuggySingleton instance1 = BuggySingleton.getInstance();
        String serialized = instance1.getValue();
        BuggySingleton instance2 = BuggySingleton.getInstance();
        assertEquals(serialized, instance2.getValue());
    }
}