import org.junit.Test;
import static org.junit.Assert.*;

public class VariableObscuringFieldTest {

    @Test
    public void testShowBug() {
        VariableObscuringField obj = new VariableObscuringField(5);
        assertEquals(5, obj.showBug()); // TRIGGER BUG: MF: Method defines a variable that obscures a field (MF_METHOD_MASKS_FIELD) 
    }
}