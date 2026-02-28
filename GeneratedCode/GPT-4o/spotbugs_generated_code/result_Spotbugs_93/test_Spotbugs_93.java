import org.junit.Test;
import static org.junit.Assert.*;

public class AnonymousClassBugTest {

    @Test
    public void testShowBug() {
        AnonymousClassBug example = new AnonymousClassBug();
        example.showBug(); // TRIGGER BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
        fail("This test is expected to fail due to the presence of an uncallable method.");// TRIGGER BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
    }
}