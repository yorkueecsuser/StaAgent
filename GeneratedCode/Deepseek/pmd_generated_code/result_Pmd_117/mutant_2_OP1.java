import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        String deadVariable1 = "abcdefgh"; // Added Dead Store Mutation
        Collection c2 = new ArrayList();
        return c1;
    }
}