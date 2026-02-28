import org.junit.Test;
import org.junit.Assert;
import java.security.AccessController;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassLoaderBugTest {
    @Test
    public void showBugTest() {
        ClassLoaderBug classLoaderBug = new ClassLoaderBug();
        // TRIGGER BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        classLoaderBug.showBug();
        Assert.fail("Expected an exception to be thrown");
    }
}