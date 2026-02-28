import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    }

    public void mutation() {
        if (false) {
            System.out.println("This statement is unreachable");
        }
    }
}