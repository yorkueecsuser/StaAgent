import java.util.*;

class BugTest {
    public Collection showBug() {
        boolean dpacvipq = false;while (dpacvipq && true && true && true && false && false && true && true && false && true && false && false) {float ggntxski = 152306675;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}