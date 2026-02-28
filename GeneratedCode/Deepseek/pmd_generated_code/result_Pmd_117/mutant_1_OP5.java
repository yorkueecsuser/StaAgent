import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector

        if (false) {
            int x = 1;
        }

        Collection c2 = new ArrayList();
        return c1;
    }
}