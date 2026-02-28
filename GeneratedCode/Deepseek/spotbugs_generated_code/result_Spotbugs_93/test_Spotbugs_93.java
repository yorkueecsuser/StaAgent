import org.junit.Test;
import static org.junit.Assert.*;

public class UncallableMethodAnonymousClassTest {
    @Test
    public void testShowBug() {
        UncallableMethodAnonymousClass obj = new UncallableMethodAnonymousClass();
        obj.showBug();
        // TRIGGER BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
        // The test will fail to compile as the executeTask method is not called or overridden.
    }
}