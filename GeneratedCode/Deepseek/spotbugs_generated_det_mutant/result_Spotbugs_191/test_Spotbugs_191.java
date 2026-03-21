import org.junit.Test;
import static org.junit.Assert.*;

public class MainClassTest {

    @Test
    public void testShowBug() {
        String initialValue = MainClass.getMutableField();
        MainClass.showBug(); // TRIGGER BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
        assertNotEquals(initialValue, MainClass.getMutableField());
    }
}