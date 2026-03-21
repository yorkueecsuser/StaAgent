import java.util.ArrayList;
import java.util.List;

class HashCodeBug {
public List < Integer > showBug(String str){
    int hashCode = str.hashCode();
    hashCode = str.hashCode();
    int absHashCode = Math.abs(hashCode);
    List < Integer > result = new ArrayList < >();
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