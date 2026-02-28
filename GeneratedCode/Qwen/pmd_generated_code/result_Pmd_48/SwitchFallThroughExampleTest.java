import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class SwitchFallThroughExampleTest {

    @Test
    public void testShowBugCase1() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        List<String> result = example.showBug(1); // TRIGGER BUG: ImplicitSwitchFallThrough
        assertEquals("[Status 1]", result.toString()); // This will fail because it should be [Status 1, Status 2, Status 3]
    }

    @Test
    public void testShowBugCase2() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        List<String> result = example.showBug(2); // TRIGGER BUG: ImplicitSwitchFallThrough
        assertEquals("[Status 2]", result.toString()); // This will fail because it should be [Status 2, Status 3]
    }

    @Test
    public void testShowBugCase3() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        List<String> result = example.showBug(3);
        assertEquals("[Status 3]", result.toString());
    }

    @Test
    public void testShowBugDefault() {
        SwitchFallThroughExample example = new SwitchFallThroughExample();
        List<String> result = example.showBug(4);
        assertEquals("[Default Status]", result.toString());
    }
}