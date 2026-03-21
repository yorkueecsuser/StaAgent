import java.util.*;

class BugTest {
    public Collection showBug() {
        double dggckjwi = -292373848;
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}