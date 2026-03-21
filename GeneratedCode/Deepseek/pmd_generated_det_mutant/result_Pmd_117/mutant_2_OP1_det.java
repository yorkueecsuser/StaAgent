import java.util.*;

class BugTest {
    public Collection showBug() {
        double dagdjvtl = -177816080;
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}