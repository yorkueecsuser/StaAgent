import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    
    @Test
    public void testSingletonClone() throws CloneNotSupportedException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = (Singleton) singleton1.clone();
        
        // Assert that singleton1 and singleton2 are not the same instance
        assertNotSame(singleton1, singleton2); // This will fail
        
        // TRIGGER BUG: SING: Class using singleton design pattern directly implements Cloneable interface. (SING_SINGLETON_IMPLEMENTS_CLONEABLE)
    }
}