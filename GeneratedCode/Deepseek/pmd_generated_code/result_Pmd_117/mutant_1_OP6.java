import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();

        // Unreachable for loop mutation
        boolean alwaysFalse = false;
        for (int i = 0; alwaysFalse; i++) {
            System.out.println("Unreachable loop");
        }
        return c1;
    }
}