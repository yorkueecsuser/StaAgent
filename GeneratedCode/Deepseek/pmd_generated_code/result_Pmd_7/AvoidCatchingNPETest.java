import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidCatchingNPETest {

    AvoidCatchingNPE avoidCatchingNPE = new AvoidCatchingNPE();

    @Test
    public void testShowBug() {
        // TRIGGER BUG: AvoidCatchingNPE
        avoidCatchingNPE.showBug();
    }
}