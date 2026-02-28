import java.util.List;
import java.util.stream.Stream;
import static org.junit.Assert.*;

public class StreamBugTest {
    @Test
    public void testBug() {
        List<Widget> widgets = new ArrayList<>();
        widgets.add(new Widget(1, "Red"));
        widgets.add(new Widget(2, "Green"));
        widgets.add(new Widget(3, "Blue"));
        widgets.add(new Widget(4, "Yellow"));
        widgets.add(new Widget(5, "Purple"));

        // TRIGGER BUG: Intermediate Stream methods should not be left unused // Noncompliant
        List<Widget> stream = widgets.stream().filter(w -> w.getColor().equals("Red"));
        assertEquals(1, stream.count());
    }
}