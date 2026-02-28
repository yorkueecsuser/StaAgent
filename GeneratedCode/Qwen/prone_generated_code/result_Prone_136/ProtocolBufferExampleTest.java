import org.junit.Test;
import static org.junit.Assert.*;

public class ProtocolBufferExampleTest {

    @Test
    public void testShowBugTriggersPrivateAccess() {
        ProtocolBufferExample example = new ProtocolBufferExample();
        ProtocolBufferExample.SecurityContractProto proto = example.new SecurityContractProto("Secret Data");
        assertEquals("Secret Data", example.showBug(proto)); // TRIGGER BUG: PrivateSecurityContractProtoAccess
    }
}