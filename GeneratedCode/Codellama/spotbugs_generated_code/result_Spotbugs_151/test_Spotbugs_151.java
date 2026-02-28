import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonClassTest {
    @Test
    public void testSingletonClass() {
        SingletonClass instance = SingletonClass.getInstance();
        try {
            SingletonClass clonedInstance = (SingletonClass) instance.clone();
            fail("Bug triggered: Cloneable interface should not be implemented in singleton class"); // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
        } catch (CloneNotSupportedException e) {
            // Expected exception
        }
    }
}