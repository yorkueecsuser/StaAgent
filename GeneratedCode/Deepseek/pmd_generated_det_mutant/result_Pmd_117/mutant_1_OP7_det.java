import java.util.*;

class BugTest {
    public Collection showBug() {
        boolean kxgwtezt = false;while (kxgwtezt && true && true && false && false && false && true && true && false && true && true && false) {byte tuurrqzu = -116;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}