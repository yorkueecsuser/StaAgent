import java.util.*;

class BugTest {
    public Collection showBug() {
        int jutzdhia = 0;switch  (jutzdhia) {case 1:boolean vblvnqdj = true;break;default:byte itjawuzc = -113;break;}
        Collection c1 = new Vector();  // BUG: UseArrayListInsteadOfVector
        Collection c2 = new ArrayList();
        return c1;
    
}
}