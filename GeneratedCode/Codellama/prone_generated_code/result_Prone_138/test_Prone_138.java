import org.junit.Test;
import static org.junit.Assert.*;

public class ProtoStringFieldReferenceEqualityTest {
    @Test
    public void testBug() {
        ProtoStringFieldReferenceEquality p = new ProtoStringFieldReferenceEquality();
        String str = p.showBug("hello");
        assertEquals("Hello", str); // TRIGGER BUG: ProtoStringFieldReferenceEquality
    }
}