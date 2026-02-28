import org.junit.Test;
import static org.junit.Assert.*;

public class HashCodeExampleTest {

    @Test
    public void testShowBug() {
        HashCodeExample example = new HashCodeExample("test");
        int result = example.showBug(); // TRIGGER BUG: Nm: Class defines hashcode(); should it be hashCode()? (NM_LCASE_HASHCODE)
        
        // This assertion will fail because the hashCode method is incorrectly named as hashcode
        assertEquals("The hashCode is expected to be overridden correctly and match Object's hashCode contract.", "test".hashCode(), result);
    }
}