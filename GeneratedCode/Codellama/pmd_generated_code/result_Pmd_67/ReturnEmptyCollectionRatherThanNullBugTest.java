import org.junit.Test;
import static org.junit.Assert.*;

public class ReturnEmptyCollectionRatherThanNullBugTest {
    @Test
    public void testGetNumbers() {
        ReturnEmptyCollectionRatherThanNullBug bug = new ReturnEmptyCollectionRatherThanNullBug();
        List<Integer> numbers = bug.getNumbers();
        assertNotNull(numbers); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
    }

    @Test
    public void testShowBug() {
        ReturnEmptyCollectionRatherThanNullBug bug = new ReturnEmptyCollectionRatherThanNullBug();
        List<Integer> numbers = bug.showBug();
        assertNotNull(numbers); // TRIGGER BUG: ReturnEmptyCollectionRatherThanNull
    }
}