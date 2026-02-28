import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityCheckExampleTest {

    public static class TestUntrustedSource extends SecurityCheckExample.UntrustedSource {
        private boolean firstCall = true;

        @Override
        public String getFilePath() {
            if (firstCall) {
                firstCall = false;
                // Return a safe path first
                return "/safe/path/file.txt";
            } else {
                // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
                return "/malicious/path/file.txt";
            }
        }
    }

    @Test
    public void testShowBugWithMaliciousSubclass() {
        SecurityCheckExample example = new SecurityCheckExample();
        SecurityCheckExample.UntrustedSource source = new TestUntrustedSource();

        // First call to ensure preliminary check passes
        assertEquals("/safe/path/file.txt", example.showBug(source));

        // This should fail because the privileged action will now return a different path
        assertEquals("/safe/path/file.txt", example.showBug(source)); // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    }
}