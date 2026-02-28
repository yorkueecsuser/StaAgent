import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        boolean condition = getCondition();
        for (int i = 0; false; i++) {
            // unreachable code
            if (i < 0) {
                break;
            }
        }
        return c1;
    }

    // This method returns a boolean value to avoid hard coded false condition
    private boolean getCondition() {
        return false;
    }
}