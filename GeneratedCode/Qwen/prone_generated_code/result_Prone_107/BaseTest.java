import org.junit.Test;
import static org.junit.Assert.*;

public class MissingSuperCallExampleTest {

    @Test
    public void testMissingSuperCall() {
        Derived derived = new Derived();
        derived.showBug(); // TRIGGER BUG: MissingSuperCall
    }
}