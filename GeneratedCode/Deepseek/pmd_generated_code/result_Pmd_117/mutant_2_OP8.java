import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection x1 = new Vector();  // MUTANT: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    }
}