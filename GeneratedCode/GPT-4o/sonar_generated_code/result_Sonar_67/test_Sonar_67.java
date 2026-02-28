import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamBugDemoTest {

    @Test
    public void testShowBug() {
        List<StreamBugDemo.Widget> widgets = List.of(
            new StreamBugDemo.Widget("RED", 10),
            new StreamBugDemo.Widget("GREEN", 20),
            new StreamBugDemo.Widget("BLUE", 30)
        );

        StreamBugDemo demo = new StreamBugDemo();
        demo.showBug(widgets); // TRIGGER BUG: Intermediate Stream methods should not be left unused
    }
}