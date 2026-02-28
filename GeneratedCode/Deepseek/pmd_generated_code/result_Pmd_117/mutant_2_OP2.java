import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c1Copy = new Vector();  // Duplication mutant
        Collection c2 = new ArrayList();
        Collection c2Copy = new ArrayList();  // Duplication mutant
        return c1;
    }
}