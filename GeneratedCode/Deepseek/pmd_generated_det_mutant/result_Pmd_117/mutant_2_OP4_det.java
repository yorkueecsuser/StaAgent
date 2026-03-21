import java.util.*;

class BugTest {
    public Collection showBug() {
        if (false && false && true && true && true && true && false && false && false && false && false) {short vzgalsme = -2316;}else{short fsuttyiv = -1813;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}