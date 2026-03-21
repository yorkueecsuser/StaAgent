import org.junit.Test;
import static org.junit.Assert.*;

public class UnhashableClassTest {
    @Test
    // TRIGGER BUG: HE: Use of class without a hashCode() method in a hashed data structure (HE_USE_OF_UNHASHABLE_CLASS)
    public void testShowBug() {
        UnhashableClass unhashableClass = new UnhashableClass(null);
        unhashableClass.showBug();
        // The test will fail here because the set size is expected to be 1 but it is 2 due to the bug in the UnhashableClass
    }
}