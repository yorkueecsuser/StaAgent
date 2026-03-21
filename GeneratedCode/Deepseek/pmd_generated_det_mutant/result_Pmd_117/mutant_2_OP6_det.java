import java.util.*;

class BugTest {
    public Collection showBug() {
        for  (int klaszabd = 0; klaszabd < 0; klaszabd++) {short ggqztglt = -346;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}