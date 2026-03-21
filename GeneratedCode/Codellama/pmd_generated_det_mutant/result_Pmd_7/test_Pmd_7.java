import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidCatchingNPETest {

    @Test
    public void testAvoidCatchingNPE() {
        AvoidCatchingNPE avoidCatchingNPE = new AvoidCatchingNPE();
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NPE"); // TRIGGER BUG: AvoidCatchingNPE
            fail("Should not catch NPE exception");
        }
    }
}