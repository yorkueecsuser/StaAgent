import org.junit.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionToArrayBugTest {

    @Test
    public void testShowBug() {
        List<CollectionToArrayBug.Foo> fooList = new ArrayList<>();
        fooList.add(new CollectionToArrayBug.Foo("Foo1"));
        fooList.add(new CollectionToArrayBug.Foo("Foo2"));
        fooList.add(new CollectionToArrayBug.Foo("Foo3"));
        
        // This call should trigger the bug due to inefficient array initialization
        CollectionToArrayBug.Foo[] resultArray = CollectionToArrayBug.showBug(fooList); // TRIGGER BUG: OptimizableToArrayCall
        
        // This assertion is expected to fail to demonstrate the bug
        assertEquals("Array length should be 0 for optimized allocation", 0, resultArray.length);
    }
}