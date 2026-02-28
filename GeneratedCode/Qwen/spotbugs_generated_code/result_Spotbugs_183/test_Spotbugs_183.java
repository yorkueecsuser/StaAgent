import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldExampleTest {

    @Test
    public void testMutableStaticFieldCanBeModified() {
        MutableStaticFieldExample mutableStaticFieldExample = new MutableStaticFieldExample();
        MutableStaticFieldExample.mutableStaticField = "Modified Value"; // TRIGGER BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
        assertEquals("Modified Value", mutableStaticFieldExample.showBug());
    }

    @Test
    public void testInitialValueOfMutableStaticField() {
        MutableStaticFieldExample mutableStaticFieldExample = new MutableStaticFieldExample();
        assertEquals("Initial Value", mutableStaticFieldExample.showBug());
        mutableStaticFieldExample.modifyField("Changed Value"); // TRIGGER BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)
        assertEquals("Changed Value", mutableStaticFieldExample.showBug());
    }
}