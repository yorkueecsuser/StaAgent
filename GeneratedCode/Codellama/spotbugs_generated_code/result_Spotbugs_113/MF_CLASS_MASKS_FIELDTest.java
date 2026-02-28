import org.junit.Test;
import static org.junit.Assert.*;

public class MF_CLASS_MASKS_FIELDTest {
    @Test
    public void testBugTrigger() {
        MF_CLASS_MASKS_FIELD obj = new MF_CLASS_MASKS_FIELD(5);
        // TRIGGER BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
        assertEquals(5, obj.getField());
    }
}