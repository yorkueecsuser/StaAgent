import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    }
    public Collection showBugMutant() {
        Collection c1 = new Vector();  // Mutant: UseVectorInsteadOfArrayList
        Collection c2 = new ArrayList();
        return c1;
    }
}