import org.junit.Test;
import static org.junit.Assert.*;

public class InstantiationToGetClassTest {
    @Test
    public void testShowBug() {
        InstantiationToGetClass instance = new InstantiationToGetClass();
        assertNotNull(instance.showBug()); // TRIGGER BUG: InstantiationToGetClass
    }
}