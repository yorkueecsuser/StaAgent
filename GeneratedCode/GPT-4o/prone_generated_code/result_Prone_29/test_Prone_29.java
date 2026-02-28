import org.junit.Test;
import static org.junit.Assert.*;

public class DaggerProvidesNullExampleTest {

    @Test
    public void testShowBug() {
        DaggerProvidesNullExample example = new DaggerProvidesNullExample();
        assertNotNull(example.showBug()); // TRIGGER BUG: DaggerProvidesNull
    }
}