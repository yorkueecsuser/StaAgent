import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c1 = new Vector();  // Duplicated Mutant
        Collection c2 = new ArrayList();
        return c1;
    }
}