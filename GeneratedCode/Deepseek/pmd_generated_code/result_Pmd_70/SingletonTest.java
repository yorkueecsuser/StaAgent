import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testGetInstanceWithObject() {
        Singleton instance1 = Singleton.getInstance(new Object());
        Singleton instance2 = Singleton.getInstance(new Object());

        // TRIGGER BUG: SingleMethodSingleton
        assertNotSame(instance1, instance2); // This assert will fail as it is comparing two different objects
    }
}