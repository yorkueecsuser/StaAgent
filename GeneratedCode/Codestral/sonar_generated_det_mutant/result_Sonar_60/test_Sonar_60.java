import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class BuggyIteratorTest {

    @Test
    public void showBugTest() {
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        BuggyIterator buggyIterator = new BuggyIterator(data);
        buggyIterator.showBug(); // TRIGGER BUG: "iterator" should not return "this"
    }
}