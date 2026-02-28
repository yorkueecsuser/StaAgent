import org.junit.Test;
import static org.junit.Assert.*;

public class ProtocolBufferAccessExampleTest {

    @Test
    public void testShowBug() {
        ProtocolBufferAccessExample example = new ProtocolBufferAccessExample();
        String result = example.showBug("TopSecretData"); // TRIGGER BUG: PrivateSecurityContractProtoAccess
        assertNull("Expected null due to security contract violation, but got: " + result, result);
    }
    
    @Test
    public void testShowBugWithEmptyData() {
        ProtocolBufferAccessExample example = new ProtocolBufferAccessExample();
        String result = example.showBug(""); // TRIGGER BUG: PrivateSecurityContractProtoAccess
        assertNull("Expected null due to security contract violation with empty data, but got: " + result, result);
    }
}