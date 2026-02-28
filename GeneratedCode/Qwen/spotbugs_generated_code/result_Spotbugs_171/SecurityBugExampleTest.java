import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityBugExampleTest {

    @Test
    public void testShowBug() {
        SecurityBugExample example = new SecurityBugExample();
        String result = example.showBug(); // TRIGGER BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
        assertNotNull(result);
    }
}