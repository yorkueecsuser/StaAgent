import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CollectionModificationDuringIterationTest {

    @Test
    public void testShowBug() {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("xenon");
        words.add("banana");
        words.add("xray");

        CollectionModificationDuringIteration.showBug(words); // TRIGGER BUG: Collections should not be modified while they are iterated
    }
}