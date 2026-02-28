import org.junit.Test;
import static org.junit.Assert.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class BadClassLoaderTest {
    @Test
    public void testShowBug() {
        final URL[] urls = new URL[0];
        // TRIGGER BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
        AccessController.doPrivileged(new PrivilegedAction<URLClassLoader>() {
            public URLClassLoader run() {
                BadClassLoader badClassLoader = new BadClassLoader();
                return badClassLoader.showBug(urls);
            }
        });
        fail("Expected SecurityException was not thrown");
    }
}