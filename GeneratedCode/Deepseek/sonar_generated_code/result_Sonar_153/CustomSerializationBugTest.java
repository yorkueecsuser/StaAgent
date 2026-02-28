import org.junit.Test;
import static org.junit.Assert.*;

public class CustomSerializationBugTest {

    @Test
    public void testShowBug() {
        CustomSerializationBug bug = new CustomSerializationBug();
        // TRIGGER BUG: Custom serialization methods should have required signatures
        bug.showBug();
    }
}