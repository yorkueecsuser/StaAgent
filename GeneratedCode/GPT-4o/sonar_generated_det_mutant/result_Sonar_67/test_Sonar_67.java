import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class StreamBugExampleTest {

    @Test
    public void testShowBug() {
        List<StreamBugExample.Widget> widgets = List.of(
            new StreamBugExample.Widget("RED", 10),
            new StreamBugExample.Widget("GREEN", 20),
            new StreamBugExample.Widget("BLUE", 30)
        );

        StreamBugExample example = new StreamBugExample();
        example.showBug(widgets); // TRIGGER BUG: Intermediate Stream methods should not be left unused
    }
}