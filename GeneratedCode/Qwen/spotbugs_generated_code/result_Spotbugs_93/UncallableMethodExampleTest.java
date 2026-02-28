import org.junit.Test;
import static org.junit.Assert.*;

public class UncallableMethodExampleTest {

    @Test
    public void testUncallableMethod() {
        UncallableMethodExample example = new UncallableMethodExample();
        example.showBug(); // TRIGGER BUG: UMAC: Uncallable method defined in anonymous class (UMAC_UNCALLABLE_METHOD_OF_ANONYMOUS_CLASS)
    }
}