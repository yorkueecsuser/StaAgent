import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalBugExampleTest {

    @Test
    public void testShowBug1() {
        ConditionalBugExample example = new ConditionalBugExample();
        example.showBug1(0);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        example.showBug1(1);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }

    @Test
    public void testShowBug2() {
        ConditionalBugExample example = new ConditionalBugExample();
        assertEquals(4, example.showBug2(10));  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }

    @Test
    public void testShowBug3() {
        ConditionalBugExample example = new ConditionalBugExample();
        example.showBug3(1);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        example.showBug3(2);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        example.showBug3(3);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        example.showBug3(4);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }
}