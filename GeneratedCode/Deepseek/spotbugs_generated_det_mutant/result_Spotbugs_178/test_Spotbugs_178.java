import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class FixedCodeTest {
    @Test
    public void testShowBug() {
        FixedCode fixedCode = new FixedCode();
        Date date = fixedCode.showBug();
        date.setTime(0); // Trigger BUG: EI2: May expose internal representation by incorporating reference to mutable object (EI_EXPOSE_REP2)
        assertEquals(0, date.getTime()); // This should fail and trigger the bug
    }
}