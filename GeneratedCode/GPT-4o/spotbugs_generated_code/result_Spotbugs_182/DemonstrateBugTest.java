import org.junit.Test;
import static org.junit.Assert.*;

public class DemonstrateBugTest {

    @Test
    public void testShowBugModifiesArray() {
        DemonstrateBug demo = new DemonstrateBug();
        int[] newValues = {9, 8, 7, 6, 5};
        int[] result = demo.showBug(newValues); // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)

        // The original array defined in the interface should not have been changed.
        // This test will fail because `showBug` modifies the array, thus triggering the bug.
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, BuggyInterface.mutableArray); // TRIGGER BUG: MS: Field should be moved out of an interface and made package protected (MS_OOI_PKGPROTECT)
    }
}