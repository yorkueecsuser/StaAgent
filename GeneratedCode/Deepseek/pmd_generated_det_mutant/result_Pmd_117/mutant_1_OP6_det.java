import java.util.*;

class BugTest {
    public Collection showBug() {
        for  (int akuiicpi = 0; akuiicpi < 0; akuiicpi++) {long evkbonmn = 388755899;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}