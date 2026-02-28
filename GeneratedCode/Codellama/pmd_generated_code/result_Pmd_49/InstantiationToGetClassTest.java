import org.junit.Test;
import static org.junit.Assert.*;

public class InstantiationToGetClassTest {
    @Test
    public void testShowBug() {
        InstantiationToGetClass.showBug();
        // TRIGGER BUG: InstantiationToGetClass
    }
}