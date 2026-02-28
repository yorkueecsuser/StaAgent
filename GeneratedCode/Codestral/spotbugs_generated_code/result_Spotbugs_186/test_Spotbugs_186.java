import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldTest {

    @Test
    public void testBugTrigger() {
        MutableStaticField obj = new MutableStaticField();
        obj.modifySharedData(100);
        MutableStaticField.sharedData = 200; // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)
        assertEquals(100, obj.showBug()); // This test case should fail as sharedData is modified outside the class
    }
}