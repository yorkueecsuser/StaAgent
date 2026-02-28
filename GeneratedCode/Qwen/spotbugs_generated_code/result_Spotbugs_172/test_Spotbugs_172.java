import org.junit.Test;
import java.net.URL;

public class ClassLoaderBugTest {

    @Test(expected = SecurityException.class)
    public void testShowBugTriggersSecurityException() {
        ClassLoaderBug bugDemo = new ClassLoaderBug();
        URL[] urls = {null}; // Using null to trigger a potential SecurityException
        bugDemo.showBug(urls); // TRIGGER BUG: DP: Classloaders should only be created inside doPrivileged block (DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED)
    }
}