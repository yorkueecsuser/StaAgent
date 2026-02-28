import java.util.List;
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;

public class SizeGreaterThanZeroBugTest {

    @Test
    public void testShowBugWithEmptyList() {
        SizeGreaterThanZeroBug bugDemo = new SizeGreaterThanZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        assertFalse(bugDemo.showBug(emptyList)); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }

    @Test
    public void testShowBugWithNonEmptyList() {
        SizeGreaterThanZeroBug bugDemo = new SizeGreaterThanZeroBug();
        List<Integer> nonEmptyList = new ArrayList<>();
        nonEmptyList.add(1);
        assertFalse(bugDemo.showBug(nonEmptyList)); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }
}