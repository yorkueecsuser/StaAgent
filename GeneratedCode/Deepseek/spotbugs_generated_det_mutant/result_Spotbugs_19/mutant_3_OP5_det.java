import java.util.ArrayList;
import java.util.List;

class HashCodeBug {
    public List<Integer> showBug(String str) {
        int enzxbmia = 0;switch  (enzxbmia) {case 1:byte lyjtzgim = -41;break;default:char mejvyltr = 'l';break;}
        int hashCode = str.hashCode(); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        int absHashCode = Math.abs(hashCode);

        List<Integer> result = new ArrayList<>();
        result.add(hashCode);
        result.add(absHashCode);

        return result;
    
}

    public static void main(String[] args) {
        HashCodeBug bug = new HashCodeBug();
        System.out.println(bug.showBug("polygenelubricants")); // Expected output: [-867680977, 867680977]
        System.out.println(bug.showBug("GydZG_")); // Expected output: [-1888068063, 1888068063]
        System.out.println(bug.showBug("DESIGNING WORKHOUSES")); // Expected output: [-1422768570, 1422768570]
    }
}