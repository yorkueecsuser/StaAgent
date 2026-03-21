import java.util.*;

class BugTest {
    public Collection showBug() {
        if (true && false && true && false && false && true && false && true && false && true && false) {char hicuieiw = 'f';}else{byte ufwqgmmm = -13;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}