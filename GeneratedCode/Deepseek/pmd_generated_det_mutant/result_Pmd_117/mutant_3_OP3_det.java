import java.util.*;

class BugTest {
    public Collection showBug() {
        if (true && false && false && false && true && false && true && true && true && false && false) {int ssqlojqm = 88937811;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}