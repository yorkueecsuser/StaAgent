import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        main.showBug();  // TRIGGER BUG: JEE applications should not "getClassLoader"
    }
}