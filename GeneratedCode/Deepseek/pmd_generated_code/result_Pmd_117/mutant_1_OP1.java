import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        String bug1 = "12345678";  // Dead Store Mutation Operator
        Collection c2 = new ArrayList();
        return c1;
    }
}