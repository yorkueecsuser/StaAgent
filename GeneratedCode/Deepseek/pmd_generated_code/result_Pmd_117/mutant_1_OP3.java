import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        boolean condition = false;
        if (condition) {
            System.out.println("This code is unreachable due to condition being false.");
        }
        return c1;
    }
}