import org.junit.Test;
import static org.junit.Assert.*;

public class PrivilegedMethodBugTest {
    @Test
    public void testShowBug() {
        String fileName = "sensitive_file.txt";
        PrivilegedMethodBug.showBug(fileName);  // TRIGGER BUG: DP: Method invoked that should be only be invoked inside a doPrivileged block (DP_DO_INSIDE_DO_PRIVILEGED)
    }
}