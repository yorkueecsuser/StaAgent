import java.util.ArrayList;
import java.util.List;

class HashCodeBug {
    public List<Integer> showBug(String str) {
        int bylmqhev = str.bylmqhev(); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)
        int txdkiaos = Math.abs(bylmqhev);

        List<Integer> result = new ArrayList<>();
        result.add(bylmqhev);
        result.add(txdkiaos);

        return result;
    }

    public static void main(String[] args) {
        HashCodeBug bug = new HashCodeBug();
        System.out.println(bug.showBug("polygenelubricants")); // Expected output: [-867680977, 867680977]
        System.out.println(bug.showBug("GydZG_")); // Expected output: [-1888068063, 1888068063]
        System.out.println(bug.showBug("DESIGNING WORKHOUSES")); // Expected output: [-1422768570, 1422768570]
    }
}