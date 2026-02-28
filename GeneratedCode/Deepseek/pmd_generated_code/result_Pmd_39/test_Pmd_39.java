import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class CountTest {

    @Test
    public void testShowBug() {
        Count count = new Count();
        ArrayList<Integer> result = count.showBug();
        assertNotNull(result);
        // TRIGGER BUG: DontUseFloatTypeForLoopIndices
    }
}