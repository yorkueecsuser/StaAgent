import java.util.*;

class BugTest {
    public Collection showBug() {
        if (false && true && true && false && false && true && false && false && false && true && false) {boolean fxedaete = false;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}