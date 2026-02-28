import org.junit.Test;
import static org.junit.Assert.*;

public class BugUnnecessaryCaseChangeTest {

    BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();

    @Test
    public void testShowBug() {
        boolean answer = bug.showBug("buz");  // TRIGGER BUG: UnnecessaryCaseChange
        assertFalse(answer);
    }

    public static void main(String[] args) {
        BugUnnecessaryCaseChange bug = new BugUnnecessaryCaseChange();
        System.out.println(bug.showBug("buz"));
    }
}