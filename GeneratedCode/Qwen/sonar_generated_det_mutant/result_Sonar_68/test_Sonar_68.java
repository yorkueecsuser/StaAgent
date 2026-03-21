import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalStructureBugTest {

    private ConditionalStructureBug bugDemo = new ConditionalStructureBug();

    @Test
    public void testShowBug1() {
        bugDemo.showBug1(0);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        bugDemo.showBug1(1);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }

    @Test
    public void testShowBug2() {
        assertEquals(4, bugDemo.showBug2(10));  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        assertEquals(4, bugDemo.showBug2(15));  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }

    @Test
    public void testShowBug3() {
        bugDemo.showBug3(1);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        bugDemo.showBug3(2);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        bugDemo.showBug3(3);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
        bugDemo.showBug3(4);  // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }
}