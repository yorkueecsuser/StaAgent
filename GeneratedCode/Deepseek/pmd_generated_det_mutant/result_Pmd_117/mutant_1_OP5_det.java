import java.util.*;

class BugTest {
    public Collection showBug() {
        int awvurksv = 0;switch  (awvurksv) {case 1:long miwerwob = -793011645;break;default:float zlqjqphc = 926997901;break;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}