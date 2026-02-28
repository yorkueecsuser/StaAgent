import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {

    @Test
    public void testSingletonPattern() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        assertEquals(singleton1, singleton2); // checks if both instances are the same

        Object obj = new Object();
        Singleton singleton3 = Singleton.getInstance(obj); // TRIGGER BUG: SingleMethodSingleton
        assertNotEquals(singleton1, singleton3); // checks if singleton3 is different from singleton1
    }

    @Test
    public void testShowBugMethod() {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = singleton1.showBug(); // calls showBug method which triggers the bug
        assertNotEquals(singleton1, singleton2); // checks if singleton2 is different from singleton1
    }
}