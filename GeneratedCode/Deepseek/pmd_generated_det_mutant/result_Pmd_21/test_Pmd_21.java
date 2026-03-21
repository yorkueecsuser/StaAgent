import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CallSuperLastTest {
    @Test
    public void testAddData() {
        CallSuperLast instance = new CallSuperLast();
        String item = "test";
        
        instance.addData(item);
        List<String> expected = new ArrayList<>();
        expected.add(item);
        
        List<String> actual = instance.showBug();
        assertEquals(expected, actual); // TRIGGER BUG: CallSuperLast
    }
}