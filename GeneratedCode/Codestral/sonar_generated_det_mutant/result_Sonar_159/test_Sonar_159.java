import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class IteratorBugTest {

    @Test
    public void showBugTest() {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);

        // TRIGGER BUG: "Iterator.hasNext()" should not call "Iterator.next()"
        // This will call iterator.next() inside iterator.hasNext() which is against the contract
        // causing unexpected behavior in production.
        IteratorBug.showBug(numbers);
    }
}