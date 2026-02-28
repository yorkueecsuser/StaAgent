import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonExampleTest {

    @Test
    public void testSingletonInstance() {
        SingletonExample obj1 = SingletonExample.getInstance(); // TRIGGER BUG: SingletonClassReturningNewInstance
        SingletonExample obj2 = SingletonExample.getInstance(); // TRIGGER BUG: SingletonClassReturningNewInstance
        assertTrue("Expected both instances to be the same", obj1 == obj2);
    }

    @Test
    public void testShowBugMethod() {
        assertTrue("Expected showBug to return true", SingletonExample.getInstance().showBug()); // TRIGGER BUG: SingletonClassReturningNewInstance
    }
}