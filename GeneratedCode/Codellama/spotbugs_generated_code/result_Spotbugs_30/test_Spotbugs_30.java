import org.junit.Test;
import static org.junit.Assert.*;

public class UnhashableClassTest {
    @Test
    public void testBug() {
        UnhashableClass obj1 = new UnhashableClass(1, "Alice");
        UnhashableClass obj2 = new UnhashableClass(1, "Alice");
        assertTrue(obj1.equals(obj2));

        HashMap<UnhashableClass, String> map = new HashMap<>();
        map.put(obj1, "value1");
        map.put(obj2, "value2"); // BUG: HE: Signature declares use of unhashable class in hashed construct (HE_SIGNATURE_DECLARES_HASHING_OF_UNHASHABLE_CLASS)

        assertEquals("value1", map.get(obj1));
        assertEquals("value2", map.get(obj2));
    }
}