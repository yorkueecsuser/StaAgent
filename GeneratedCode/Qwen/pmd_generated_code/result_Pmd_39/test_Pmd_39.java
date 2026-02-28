import org.junit.Test;
import static org.junit.Assert.*;

public class CountTest {

    @Test
    public void testShowBug() {
        Count countInstance = new Count();
        int result = countInstance.showBug(); // TRIGGER BUG: DontUseFloatTypeForLoopIndices
        assertEquals(50, result); // This assertion will fail due to the bug in showBug method
    }
}