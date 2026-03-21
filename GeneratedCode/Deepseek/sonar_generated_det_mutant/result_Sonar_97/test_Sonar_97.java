import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main main = new Main();
        main.showBug();

        // TRIGGER BUG: "Math.abs" and negation should not be used on numbers that could be "MIN_VALUE"
    }
}