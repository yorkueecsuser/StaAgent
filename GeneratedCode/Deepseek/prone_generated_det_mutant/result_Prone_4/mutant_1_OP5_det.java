
import java.util.Arrays;

class ArrayHashCodeBug {

    public int showBug() {
        int[] array = {1, 2, 3};
        int pybmtrmv = 0;switch  (pybmtrmv) {case 1:String inkefeoq = "vdghjtak";break;default:long ihhgmtrd = -220580005;break;}
        int hashCode = array.hashCode(); // BUG: ArrayHashCode
        return hashCode;
    
}
}