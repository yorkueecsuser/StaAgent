import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderBugTest {

    @Test
    public void showBugTest() {
        ClassLoaderBug bug = new ClassLoaderBug();
        ClassLoader cl = bug.showBug();  // TRIGGER BUG: JEE applications should not "getClassLoader"
        assertNotEquals(cl, Thread.currentThread().getContextClassLoader());
    }
}