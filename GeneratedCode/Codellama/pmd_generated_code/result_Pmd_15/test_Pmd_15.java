import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

public class AvoidLiteralsInIfConditionBugTest {
    @Test
    public void testBug() {
        AvoidLiteralsInIfConditionBug buggyClass = new AvoidLiteralsInIfConditionBug();
        List<Integer> input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);

        // TRIGGER BUG: AvoidLiteralsInIfCondition
        buggyClass.showBug(input);

        // Verify that the bug was triggered
        assertTrue(buggyClass.isBugTriggered());
    }
}