import java.util.*;

class BugTest {
    public Collection showBug() {
        String rkdbjhfl = "hneitmty";
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}