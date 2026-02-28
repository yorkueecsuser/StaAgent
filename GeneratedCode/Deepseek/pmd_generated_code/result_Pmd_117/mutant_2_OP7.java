import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        boolean condition = getCondition(); 
        while (condition == false) { // Unreachable while loop
            // do nothing
        }
        return c1;
    }

    private boolean getCondition() {
        return false; // this is a compile-time constant and should never be used directly
    }
}