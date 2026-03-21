import org.junit.Test;
import static org.junit.Assert.*;

public class CloneMethodReturnTypeMustMatchClassNameTest {
    @Test
    // TRIGGER BUG: CloneMethodReturnTypeMustMatchClassName
    public void testShowBug() {
        CloneMethodReturnTypeMustMatchClassName obj = new CloneMethodReturnTypeMustMatchClassName();
        assertNotSame(null, obj.showBug());  // This assertion is supposed to fail
    }
}