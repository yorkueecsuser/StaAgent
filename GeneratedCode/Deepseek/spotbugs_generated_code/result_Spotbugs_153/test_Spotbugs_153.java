import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBugTest {

    @Test
    public void testSingletonBug() throws CloneNotSupportedException {
        SingletonBug instance1 = SingletonBug.getInstance();
        SingletonBug instance2 = instance1.getClone(); // TRIGGER BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD)
        assertNotSame(instance1, instance2); // The bug is triggered here
    }
}