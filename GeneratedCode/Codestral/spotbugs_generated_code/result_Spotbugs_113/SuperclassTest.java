import org.junit.Test;
import static org.junit.Assert.*;

public class SubclassTest {

    @Test
    public void testShowBug() {
        Subclass subclass = new Subclass();
        // TRIGGER BUG: MF: Class defines field that masks a superclass field (MF_CLASS_MASKS_FIELD)
        assertEquals("Message from Superclass", subclass.showBug());
    }
}