import org.junit.Test;
import static org.junit.Assert.*;

import java.security.*;
import java.lang.reflect.Method;

public class BuggyCodeTest {
    @Test
    public void testBuggyCode() throws Exception {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug(); // TRIGGER BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
    }
}