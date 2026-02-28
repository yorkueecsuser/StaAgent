import org.junit.Test;
import static org.junit.Assert.*;

public class DaggerNullProvidesBugTest {
    @Test
    public void testProvideString() {
        DaggerNullProvidesBug bug = new DaggerNullProvidesBug();
        bug.showBug(); // TRIGGER BUG: DaggerProvidesNull
    }
}