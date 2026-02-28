import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class NCopiesBugExampleTest {

    @Test
    public void testShowBug() {
        NCopiesBugExample example = new NCopiesBugExample();
        List<Integer> result = example.showBug(); // TRIGGER BUG: NCopiesOfChar
        
        // The test is expected to fail because the size should be 10 but is 97 due to the bug
        assertEquals(10, result.size());

        // The test is expected to fail because the first element should be 'a' but is 10 due to the bug
        assertEquals((Integer)(int)'a', result.get(0));
    }
}