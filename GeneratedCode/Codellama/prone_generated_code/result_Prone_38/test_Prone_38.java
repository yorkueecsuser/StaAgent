import org.junit.Test;

public class DuplicateBranchesTest {
    @Test
    public void testDuplicateBranches() {
        DuplicateBranches duplicateBranches = new DuplicateBranches();
        int x = 5;
        int y = 10;

// TRIGGER BUG: DuplicateBranches
        if (x > 0) {
            System.out.println("x is greater than 0");
        } else {
            System.out.println("x is less than or equal to 0");
        }

        assertEquals("x is greater than 0", duplicateBranches.showBug(x));
    }
}