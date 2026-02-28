import org.junit.Test;
import static org.junit.Assert.*;

public class UninitializedReadExampleTest {

    @Test
    public void testShowBug() {
        UninitializedReadExample example = new UninitializedReadExample(10);
        int result = example.showBug(10); // TRIGGER BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        assertEquals(10, result); // This assertion is expected to fail due to the bug
    }

    @Test
    public void testShowBugWithDifferentValue() {
        UninitializedReadExample example = new UninitializedReadExample(5);
        int result = example.showBug(5); // TRIGGER BUG: UR: Uninitialized read of field in constructor (UR_UNINIT_READ)
        assertEquals(5, result); // This assertion is expected to fail due to the bug
    }
}