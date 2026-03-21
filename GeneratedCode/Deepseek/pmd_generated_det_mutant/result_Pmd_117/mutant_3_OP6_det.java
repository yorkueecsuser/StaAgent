import java.util.*;

class BugTest {
    public Collection showBug() {
        for  (int eztsgvvi = 0; eztsgvvi < 0; eztsgvvi++) {char cwauarik = 'l';}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}