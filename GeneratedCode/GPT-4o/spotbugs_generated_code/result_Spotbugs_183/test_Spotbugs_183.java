import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldDemoTest {

    @Test
    public void testMutableStaticFieldChange() {
        MutableStaticFieldDemo demo = new MutableStaticFieldDemo();
        
        // Initial value
        assertEquals(100, MutableStaticFieldDemo.mutableStaticField);

        // Trigger bug by changing the value
        demo.showBug(200); // TRIGGER BUG: MS: Field should be both final and package protected (MS_FINAL_PKGPROTECT)

        // Assert to fail, expecting the initial value to be unchanged if it were final
        assertEquals(100, MutableStaticFieldDemo.mutableStaticField); // This assertion will fail
    }
}