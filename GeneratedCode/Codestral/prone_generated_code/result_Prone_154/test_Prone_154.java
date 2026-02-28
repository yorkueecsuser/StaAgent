import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SizeGreaterThanOrEqualsZeroBugTest {

    @Test
    public void testShowBugWithEmptyList() {
        SizeGreaterThanOrEqualsZeroBug bugInstance = new SizeGreaterThanOrEqualsZeroBug();
        List<Integer> emptyList = new ArrayList<>();
        assertFalse(bugInstance.showBug(emptyList)); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }
}