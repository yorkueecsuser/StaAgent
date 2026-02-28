import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class IteratorBugDemoTest {

    @Test
    public void testShowBugTriggersBug() {
        IteratorBugDemo demo = new IteratorBugDemo();
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        
        // The following line triggers the bug
        String result = demo.showBug(list); // TRIGGER BUG: DMI: hasNext method invokes next (DMI_CALLING_NEXT_FROM_HASNEXT)  
        
        // The test will fail because the iterator's state is altered by hasNext()
        assertEquals("Hello World ", result);
    }
}