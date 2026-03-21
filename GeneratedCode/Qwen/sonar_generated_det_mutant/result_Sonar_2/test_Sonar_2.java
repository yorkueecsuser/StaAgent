import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamReuseExampleTest {

    @Test(expected = IllegalStateException.class)
    public void testShowBug() {
        StreamReuseExample example = new StreamReuseExample();
        List<StreamReuseExample.Widget> widgets = List.of(
            new StreamReuseExample.Widget("RED", 10),
            new StreamReuseExample.Widget("BLUE", 20),
            new StreamReuseExample.Widget("RED", 30)
        );
        example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}