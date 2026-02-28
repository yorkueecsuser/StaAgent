import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderBugTest {
    @Test
    public void testShowBug() {
        ClassLoaderBug bug = new ClassLoaderBug();
        bug.showBug(); // TRIGGER BUG: JEE applications should not "getClassLoader"
    }
}