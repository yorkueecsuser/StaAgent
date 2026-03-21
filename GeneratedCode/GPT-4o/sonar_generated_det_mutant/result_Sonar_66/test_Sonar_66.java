import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StreamReuseExampleTest {

    @Test
    public void testShowBug() {
        StreamReuseExample example = new StreamReuseExample();
        List<StreamReuseExample.Widget> widgets = Arrays.asList(
                new StreamReuseExample.Widget("RED", 5),
                new StreamReuseExample.Widget("BLUE", 10),
                new StreamReuseExample.Widget("RED", 15)
        );

        int[] result = example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
        assertEquals(2, result[0]);  // Expecting count of RED widgets
        assertEquals(20, result[1]); // Expecting sum of weights of RED widgets
    }
}