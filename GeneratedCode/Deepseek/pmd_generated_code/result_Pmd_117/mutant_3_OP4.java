import java.util.*;

class BugTest {
    private boolean getCondition() {
        return false;
    }

    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();

        // Adding an unreachable if-else statement
        if (getCondition()) {
            c1 = c2;
        } else {
            // This part of the code is unreachable.
            c1 = new Vector();
        }

        return c1;
    }
}