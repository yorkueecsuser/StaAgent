import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;

class UnhashableClassTest {
    @Test
    public void testShowBug() {
        UnhashableClass c1 = new UnhashableClass(1, 1);
        UnhashableClass c2 = new UnhashableClass(1, 2);
        HashSet<UnhashableClass> set = new HashSet<>();
        set.add(c1);
        set.add(c2);
        assertTrue(set.contains(c1));
        UnhashableClass.showBug(c1, c2);
    }
}