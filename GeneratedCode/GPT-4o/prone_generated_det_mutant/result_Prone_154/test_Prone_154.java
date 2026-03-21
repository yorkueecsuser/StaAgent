import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class SizeCheckDemoTest {

    @Test
    public void testShowBugWithEmptyList() {
        SizeCheckDemo demo = new SizeCheckDemo();
        List<String> emptyList = new ArrayList<>();

        // The following assertion is expected to fail since the method always returns true
        assertFalse(demo.showBug(emptyList)); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }

    @Test
    public void testShowBugWithNonEmptyList() {
        SizeCheckDemo demo = new SizeCheckDemo();
        List<String> nonEmptyList = new ArrayList<>();
        nonEmptyList.add("item1");

        // The following assertion is expected to be true, but since method always returns true, it triggers the bug
        assertFalse(demo.showBug(nonEmptyList)); // TRIGGER BUG: SizeGreaterThanOrEqualsZero
    }
}