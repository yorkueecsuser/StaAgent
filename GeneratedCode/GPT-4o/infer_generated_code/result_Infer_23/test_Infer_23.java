import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableModificationExampleTest {

    @Test
    public void testShowBug() {
        ImmutableModificationExample example = new ImmutableModificationExample();
        int[] modifiedArray = example.showBug(); // TRIGGER BUG: MODIFIES_IMMUTABLE​
        
        // We expect the array to remain [0, 1, 2, 3] but due to the bug it becomes [0, 1, 7, 3]
        assertArrayEquals(new int[]{0, 1, 2, 3}, modifiedArray);
    }

}