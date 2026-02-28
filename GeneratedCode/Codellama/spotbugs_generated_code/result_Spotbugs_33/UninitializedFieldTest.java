import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedFieldTest {
    @Test
    public void testShowBug() {
        UninitializedField uf = new UninitializedField(null);
        int hashCode = uf.getHashCode(); // TRIGGER BUG: UR: Uninitialized read of field method called from constructor of superclass (UR_UNINIT_READ_CALLED_FROM_SUPER_CONSTRUCTOR)
        assertEquals(0, hashCode);
    }

    @Test
    public void testGetHashCode() {
        UninitializedField uf = new UninitializedField("test");
        int hashCode = uf.getHashCode();
        assertEquals("test".hashCode(), hashCode);
    }

    @Test
    public void testGetValue() {
        UninitializedField uf = new UninitializedField("test");
        Object value = uf.getValue();
        assertEquals("test", value);
    }
}