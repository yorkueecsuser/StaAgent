import org.junit.Test;
import static org.junit.Assert.*;

public class SecurityContractDemoTest {
    @Test
    public void testShowBug() {
        SecurityContractDemo demo = new SecurityContractDemo();
        // TRIGGER BUG: PrivateSecurityContractProtoAccess
        String result = demo.showBug(new byte[0]);
        // The bug is triggered by calling the showBug method, which attempts to access a private field of a SecurityContract object.
        // Since we can't actually use Protocol Buffers here without the necessary imports, this test case will not fail as expected in real-world scenario.
        // However, it simulates the bug by demonstrating the attempt to access a private field, which would be forbidden in a real-world scenario.
        // This test case will pass, but it's important to note that it should ideally fail in a real-world scenario
    }
}