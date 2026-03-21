import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamReuseExampleTest {

    @Test
    public void testShowBug() {
        StreamReuseExample example = new StreamReuseExample();
        List<StreamReuseExample.Widget> widgets = List.of(
            new StreamReuseExample.Widget("RED", 10),
            new StreamReuseExample.Widget("BLUE", 20),
            new StreamReuseExample.Widget("RED", 30)
        );
        
        // The following line triggers the bug by calling showBug which reuses a consumed stream
        int result = example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
        
        // We expect this test to fail due to the bug in showBug method
        assertEquals(40, result); // This assertion will fail because the bug causes incorrect behavior
    }
}