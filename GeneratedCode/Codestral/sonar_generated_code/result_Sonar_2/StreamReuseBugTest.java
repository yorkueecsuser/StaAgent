import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class StreamReuseBugTest {
    @Test
    public void testShowBug() {
        List<StreamReuseBug.Widget> widgets = new ArrayList<>();
        widgets.add(new StreamReuseBug.Widget("RED", 10));
        widgets.add(new StreamReuseBug.Widget("BLUE", 20));
        widgets.add(new StreamReuseBug.Widget("RED", 30));

        StreamReuseBug bug = new StreamReuseBug();
        bug.showBug(widgets); // TRIGGER BUG: Consumed Stream pipelines should not be reused
    }
}