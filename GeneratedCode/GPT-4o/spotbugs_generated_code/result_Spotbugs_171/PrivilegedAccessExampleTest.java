import org.junit.Test;
import static org.junit.Assert.*;

public class PrivilegedAccessExampleTest {

    @Test
    public void testShowBug() {
        PrivilegedAccessExample example = new PrivilegedAccessExample();
        example.showBug("test.txt"); // TRIGGER BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
    }
}