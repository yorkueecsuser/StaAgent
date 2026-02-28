import org.junit.Test;
import static org.junit.Assert.*;

public class FieldMaskingExampleTest {

    @Test
    public void testShowBug() {
        SubClass sub = new SubClass();
        assertEquals(10, sub.showBug()); // TRIGGER BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
    }
}