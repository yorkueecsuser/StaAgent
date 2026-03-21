import java.util.*;

class BugTest {
    public Collection showBug() {
        if (true && false && false && false && false && false && true && true && true && false && false) {short aaeiaapy = 9006;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}