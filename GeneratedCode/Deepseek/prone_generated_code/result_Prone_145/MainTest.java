import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testRequiredModifiersBug() {
        Main obj = new Main();  
        obj.showBug();
    }
}