import org.junit.Test;
import static org.junit.Assert.*;

public class ModifiesImmutableExampleTest {

    @Test
    public void testMutateArray() {
        ModifiesImmutableExample example = new ModifiesImmutableExample();
        assertEquals(2, example.showBug()); // TRIGGER BUG: MODIFIES_IMMUTABLE
    }
}