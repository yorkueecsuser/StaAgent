import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.List;

public class StreamReuseExampleTest {

    @Test(expected = IllegalStateException.class)
    public void testShowBugTriggersException() {
        StreamReuseExample example = new StreamReuseExample();
        List<Widget> widgets = Arrays.asList(
            new Widget("RED", 10),
            new Widget("BLUE", 20),
            new Widget("RED", 30)
        );
        example.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}