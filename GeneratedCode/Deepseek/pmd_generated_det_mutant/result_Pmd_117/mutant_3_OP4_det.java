import java.util.*;

class BugTest {
    public Collection showBug() {
        if (false && false && true && true && false && true && true && true && true && false && false) {long zzalcfmc = -944896388;}else{double sluybrzn = 48168501;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}