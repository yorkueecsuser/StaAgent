import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // MUTANT: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        c1 = c2;
        return c1;
    }
}