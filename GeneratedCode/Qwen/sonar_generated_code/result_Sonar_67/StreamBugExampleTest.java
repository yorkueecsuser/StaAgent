import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

public class StreamBugExampleTest {

    @Test
    public void testShowBugWithUnusedIntermediateOperation() {
        StreamBugExample example = new StreamBugExample();
        List<String> words = Arrays.asList("apple", "banana", "pear", "kiwi");
        example.showBug(words); // TRIGGER BUG: Intermediate Stream methods should not be left unused
    }
}