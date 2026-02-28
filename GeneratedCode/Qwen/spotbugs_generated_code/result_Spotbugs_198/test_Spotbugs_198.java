import org.junit.Test;
import static org.junit.Assert.*;

public class UntrustedSourceCheckTest {

    @Test
    public void testShowBugWithMaliciousPath() {
        UntrustedSourceCheck checker = new UntrustedSourceCheck();
        checker.showBug("/malicious/path"); // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    }

    @Test
    public void testShowBugWithSafePath() {
        UntrustedSourceCheck checker = new UntrustedSourceCheck();
        checker.showBug("/safe/path"); // TRIGGER BUG: USC: Potential security check based on untrusted source. (USC_POTENTIAL_SECURITY_CHECK_BASED_ON_UNTRUSTED_SOURCE)
    }
}