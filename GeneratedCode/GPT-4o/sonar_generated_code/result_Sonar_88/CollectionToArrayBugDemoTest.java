import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

public class CollectionToArrayBugDemoTest {

    @Test
    public void testShowBug() {
        CollectionToArrayBugDemo demo = new CollectionToArrayBugDemo();
        List<String> sampleList = List.of("Apple", "Banana", "Cherry");

        // TRIGGER BUG: "Collection.toArray()" should be passed an array of the proper type
        String[] result = demo.showBug(sampleList); 
        
        assertNotNull(result);
        assertEquals(3, result.length);
        assertEquals("Apple", result[0]);
        assertEquals("Banana", result[1]);
        assertEquals("Cherry", result[2]);
    }
}