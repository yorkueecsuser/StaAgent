import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;

public class AvoidAccessibilityAlterationTest {
    @Test
    public void testShowBug() throws Exception {
        AvoidAccessibilityAlteration testObj = new AvoidAccessibilityAlteration();
        testObj.showBug(); // TRIGGER BUG: AvoidAccessibilityAlteration
    }
}