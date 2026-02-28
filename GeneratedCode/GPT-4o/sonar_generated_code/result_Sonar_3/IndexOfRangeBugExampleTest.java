import org.junit.Test;
import static org.junit.Assert.*;

public class IndexOfRangeBugExampleTest {

    @Test
    public void testIndexOfWithReversedRange() {
        IndexOfRangeBugExample example = new IndexOfRangeBugExample();
        // This will cause a StringIndexOutOfBoundsException due to beginIndex > endIndex
        int result = example.showBug("hello world", "world", 11, 5); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }

    @Test
    public void testIndexOfWithNegativeBeginIndex() {
        IndexOfRangeBugExample example = new IndexOfRangeBugExample();
        // This will cause a StringIndexOutOfBoundsException due to negative beginIndex
        int result = example.showBug("hello world", "world", -1, 5); // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }
}