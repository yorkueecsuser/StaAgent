import org.junit.Test;
import static org.junit.Assert.*;

public class RacerDTest {
    @Test
    public void bugTest() {
        // TRIGGER BUG: INTERFACE_NOT_THREAD_SAFE
        RacerD racerD = new RacerD();
        I i = new I();
        C c = new C();
        c.foo(i);
        racerD.showBug();
    }
}