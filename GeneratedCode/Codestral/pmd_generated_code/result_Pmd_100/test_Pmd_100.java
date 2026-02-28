import org.junit.Test;
import static org.junit.Assert.*;

public class AppendCharacterBugTest {
    @Test
    public void demonstrateBugTest() {
        AppendCharacterBug bugDemo = new AppendCharacterBug();
        // TRIGGER BUG: AppendCharacterWithChar
        assertEquals("a", bugDemo.demonstrateBug('a'));
    }

    @Test
    public void showBugTest() {
        AppendCharacterBug bugDemo = new AppendCharacterBug();
        // This test case does not trigger the bug as the showBug method does not return a value
        bugDemo.showBug();
    }
}