import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        Collection c3 = new Vector();  // Mutant 1: Rename 'c1' to 'c3'
        return c1;
    }
}