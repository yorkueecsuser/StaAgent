import org.junit.Test;
import static org.junit.Assert.*;

public class RecordExampleTest {

    @Test
    public void testShowBug() {
        RecordExample example = new RecordExample();
        assertEquals("This record contains serialization methods and fields that are ignored.", example.showBug()); // TRIGGER BUG: Members ignored during record serialization should not be used
    }
}