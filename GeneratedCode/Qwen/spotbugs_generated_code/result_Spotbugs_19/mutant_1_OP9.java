import java.util.Objects;

class HashcodeBugDemo {

    public int showBug(String input) {
        int hashCode = Objects.hashCode(input);
        int absHashCode = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Introduced do-while loop that performs a no-op
        int i = 0;
        do {
            // No operation
        } while (i > 0);

        return absHashCode;
    }

    public static void main(String[] args) {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        System.out.println("Absolute hashcode of 'polygenelubricants': " + demo.showBug("polygenelubricants"));
        System.out.println("Absolute hashcode of 'GydZG_': " + demo.showBug("GydZG_"));
        System.out.println("Absolute hashcode of 'DESIGNING WORKHOUSES': " + demo.showBug("DESIGNING WORKHOUSES"));
    }
}