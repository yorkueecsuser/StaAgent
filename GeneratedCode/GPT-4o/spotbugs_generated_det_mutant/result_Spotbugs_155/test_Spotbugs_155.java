import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonSerializableBugTest {

    @Test
    public void testSingletonSerializableBug() {
        // Attempting to trigger the bug by calling showBug method
        SingletonSerializableBug instance1 = SingletonSerializableBug.getInstance();
        SingletonSerializableBug instance2 = instance1.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern directly or indirectly implements Serializable interface. (SING_SINGLETON_IMPLEMENTS_SERIALIZABLE)

        // The test is expected to fail to demonstrate the bug
        // The bug here is that serialization can break the singleton pattern
        assertSame("Instances should be the same", instance1, instance2);
    }
}