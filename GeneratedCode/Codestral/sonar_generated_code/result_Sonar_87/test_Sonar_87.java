import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderBugTest {
    @Test
    public void testShowBug() {
        ClassLoaderBug bug = new ClassLoaderBug();
        ClassLoader obtainedClassLoader = bug.showBug();
        // TRIGGER BUG: JEE applications should not "getClassLoader"
        ClassLoader expectedClassLoader = Thread.currentThread().getContextClassLoader();
        assertNotSame(obtainedClassLoader, expectedClassLoader);
    }
}