import org.junit.Test;
import static org.junit.Assert.*;

public class RecordSerializationBugDemoTest {

    @Test
    public void testShowBug() {
        RecordSerializationBugDemo demo = new RecordSerializationBugDemo();
        demo.showBug(); // TRIGGER BUG: Members ignored during record serialization should not be used
    }
}