import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonClassTest {

    @Test
    public void testSingletonBug() {
        SingletonClass singleton = SingletonClass.getInstance();
        try {
            SingletonClass clone = (SingletonClass) singleton.clone(); // TRIGGER BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD)
            assertNotSame(singleton, clone);
        } catch (CloneNotSupportedException e) {
            fail("Expected CloneNotSupportedException to be thrown");
        }
    }
}