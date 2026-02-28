import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testSingletonCloneFailure() {
        SingletonExample singleton = SingletonExample.getInstance();
        String result = singleton.showBug(); // TRIGGER BUG: SING: Class using singleton design pattern implements clone() method without being an unconditional CloneNotSupportedException-thrower. (SING_SINGLETON_IMPLEMENTS_CLONE_METHOD) 
        assertEquals("CloneNotSupportedException caught", result);
    }
}