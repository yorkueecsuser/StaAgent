import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        int temp12345678 = 10;
        Collection c2 = new ArrayList();
        int temp87654321 = 20;
        return c1;
    }
}