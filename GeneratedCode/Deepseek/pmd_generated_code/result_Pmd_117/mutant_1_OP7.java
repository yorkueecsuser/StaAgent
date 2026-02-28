import java.util.*;

class BugTest {
    public Collection showBug() {
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        boolean unreachable = false;
        while(unreachable){
            // This will always be unreachable because the condition is always false
            // This is just to avoid unreachable statement error
        }
        return c1;
    }
}