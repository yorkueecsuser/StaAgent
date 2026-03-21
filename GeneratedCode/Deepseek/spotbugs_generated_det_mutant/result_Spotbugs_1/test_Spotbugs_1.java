import org.junit.Test;

public class BuggyCodeTest {
    @Test
    public void testMethodToOverrideShouldCallSuperMethod() {
        BuggyCode buggyCode = new BuggyCode();
        buggyCode.showBug();
    }
}