import org.junit.Test;
import static org.junit.Assert.*;

public class ClassLoaderBugExampleTest {

    @Test
    public void testShowBug() {
        ClassLoaderBugExample example = new ClassLoaderBugExample();
        ClassLoader classLoader = example.showBug(); // TRIGGER BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        assertNotNull("ClassLoader should not be null", classLoader);
    }
}