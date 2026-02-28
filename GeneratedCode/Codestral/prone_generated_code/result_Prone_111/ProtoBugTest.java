import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoBugTest {
    @Test
    public void testShowBug() throws NoSuchFieldException, SecurityException {
        ProtoBug pb = new ProtoBug();
        pb.showBug(); // TRIGGER BUG: MixedDescriptors
    }
}