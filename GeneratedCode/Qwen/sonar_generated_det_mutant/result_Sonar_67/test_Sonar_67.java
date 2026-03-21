import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class StreamBugExampleTest {

    @Test
    public void testShowBug() {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date");
        StreamBugExample.showBug(words); // TRIGGER BUG: Intermediate Stream methods should not be left unused
    }
}