import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class NCopiesOfCharExampleTest {

    @Test
    public void testShowBug() {
        NCopiesOfCharExample example = new NCopiesOfCharExample();
        List<Integer> result = example.showBug(10, 'a'); // TRIGGER BUG: NCopiesOfChar
        assertEquals(10, result.size());
        assertEquals(Integer.valueOf(10), result.get(0));
    }
}