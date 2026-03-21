import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class StreamReuseExampleTest {

    @Test
    public void testShowBug() {
        StreamReuseExample example = new StreamReuseExample();
        
        List<StreamReuseExample.Widget> widgets = new ArrayList<>();
        widgets.add(new StreamReuseExample.Widget(StreamReuseExample.Color.RED, 10));
        
        example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}