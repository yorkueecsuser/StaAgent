import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamReuseExampleTest {

    @Test
    public void testShowBug() {
        List<Widget> widgets = List.of(new Widget("RED", 10), new Widget("BLUE", 5));
        StreamReuseExample example = new StreamReuseExample();
        
        // This will trigger the bug because the stream is reused after a terminal operation
        example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}