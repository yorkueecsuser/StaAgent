import java.util.*;

class BugTest {
    public Collection showBug() {
        boolean eoypfork = false;while (eoypfork && true && false && false && false && true && true && false && true && true && false && false) {char zfvfrhub = 'g';}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}