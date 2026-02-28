import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldExampleTest {

    @Test
    public void testShowBug_ModifiesStaticField() {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        example.showBug(5); // TRIGGER BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
        assertEquals(0, MutableStaticFieldExample.mutableStaticField); // This assertion will fail, demonstrating the bug
    }

    @Test
    public void testShowBug_SecondModification() {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        example.showBug(10); // TRIGGER BUG: MS: Field isn’t final and cannot be protected from malicious code (MS_CANNOT_BE_FINAL)
        assertEquals(5, MutableStaticFieldExample.mutableStaticField); // This assertion will fail, demonstrating the bug
    }
}