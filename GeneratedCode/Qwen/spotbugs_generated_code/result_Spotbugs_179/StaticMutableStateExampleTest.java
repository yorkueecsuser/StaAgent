import org.junit.Test;
import static org.junit.Assert.*;

public class StaticMutableStateExampleTest {

    @Test
    public void testSharedListModification() {
        StaticMutableStateExample example1 = new StaticMutableStateExample();
        example1.addToList("Item1");

        StaticMutableStateExample example2 = new StaticMutableStateExample();
        example2.addToList("Item2");

        // Both instances should share the same list, so modifying one should affect the other
        assertEquals(2, example1.showBug().size()); // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
        assertEquals(2, example2.showBug().size()); // TRIGGER BUG: MS: May expose internal static state by storing a mutable object into a static field (EI_EXPOSE_STATIC_REP2)
    }
}