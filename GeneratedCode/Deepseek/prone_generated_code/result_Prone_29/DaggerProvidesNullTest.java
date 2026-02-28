import org.junit.Test;
import static org.junit.Assert.*;

public class DaggerProvidesNullTest {

    @Test
    public void testShowBug() {
        DaggerProvidesNull obj = new DaggerProvidesNull();
        assertNull(obj.showBug()); // TRIGGER BUG: DaggerProvidesNull
    }
}