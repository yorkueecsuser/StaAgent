import org.junit.Test;
import static org.junit.Assert.*;

public class DMI_CALLING_NEXT_FROM_HASNEXTTest {
    DMI_CALLING_NEXT_FROM_HASNEXT dmi = new DMI_CALLING_NEXT_FROM_HASNEXT();

    @Test
    public void testShowBug() {
        Integer result = (Integer) dmi.showBug();
        assertNotNull(result); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)
    }
}