import org.junit.Test;
import static org.junit.Assert.*;

public class JumbledIncrementerRule1Test {
    @Test
    public void testShowBug() {
        JumbledIncrementerRule1 jumbledIncrementerRule1 = new JumbledIncrementerRule1();
        jumbledIncrementerRule1.showBug();  // TRIGGER BUG: JumbledIncrementer
    }
}