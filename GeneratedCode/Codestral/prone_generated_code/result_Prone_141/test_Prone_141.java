import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: ProvidesMethodOutsideOfModule
    public void testShowBug() {
        Main main = new Main();
        main.showBug();
        assertNull(main.car.getEngine()); // This will fail as main.car.engine is null
    }
}