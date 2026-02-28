import java.util.Objects;

class HashcodeBugDemo {

    public int showBug(String input) {
        int hashCode = Objects.hashCode(input);
        int absHashCode = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE) 
        int x = hashCode; // Renamed variable
        int y = absHashCode; // Renamed variable
        return y;
    }

    public static void main(String[] args) {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        String a = "polygenelubricants"; // Renamed variable
        String b = "GydZG_"; // Renamed variable
        String c = "DESIGNING WORKHOUSES"; // Renamed variable
        System.out.println("Absolute hashcode of 'polygenelubricants': " + demo.showBug(a));
        System.out.println("Absolute hashcode of 'GydZG_': " + demo.showBug(b));
        System.out.println("Absolute hashcode of 'DESIGNING WORKHOUSES': " + demo.showBug(c));
    }
}