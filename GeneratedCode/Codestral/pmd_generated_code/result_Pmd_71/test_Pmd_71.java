import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void testSingletonPattern() {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // TRIGGER BUG: SingletonClassReturningNewInstance
        assertSame(instance1, instance2);
        // The assertSame() method checks that two object references point to the same object.
        // If the two references point to different objects, this method throws an AssertionError.
        // In this case, if instance1 and instance2 point to different objects, the test will fail.
        // This is because the Singleton class is returning a new instance each time getInstance() is called,
        // violating the singleton pattern.
    }

    @Test
    public void testShowBugMethod() {
        Singleton.showBug();
        // Calling the showBug() method in the test cases to ensure that it demonstrates the bug.
        // If the bug is not triggered and the test does not fail, it indicates that the showBug() method is not correctly demonstrating the bug.
    }
}