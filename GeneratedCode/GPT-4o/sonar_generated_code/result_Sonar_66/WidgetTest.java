import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.Arrays;

public class StreamReuseExampleTest {

    @Test
    public void testShowBug() {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = Arrays.asList(
            new Widget("RED", 10),
            new Widget("BLUE", 20),
            new Widget("RED", 30)
        );

        // This will trigger the bug due to stream reuse
        int[] result = example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused

        assertEquals(2, result.length); // We expect an array of length 2
    }
}