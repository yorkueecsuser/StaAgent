import java.util.*;

class BugTest {
    public Collection showBug() {
        int rqumrtbc = 0;switch  (rqumrtbc) {case 1:String rfeqxxsw = "nrqdmvmo";break;default:long uzxakwhq = -816571103;break;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}