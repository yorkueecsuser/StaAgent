import java.util.Objects;

class HashcodeBugDemo {

    public int showBug(String input) {
        int hashCode = Objects.hashCode(input);
        int absHashCode = Math.abs(hashCode); // BUG: RV: Bad attempt to compute absolute value of signed 32-bit hashcode (RV_ABSOLUTE_VALUE_OF_HASHCODE)

        // Inserting unreachable if branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            absHashCode = -absHashCode; // Unique code to demonstrate the insertion
        }

        return absHashCode;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        HashcodeBugDemo demo = new HashcodeBugDemo();
        System.out.println("Absolute hashcode of 'polygenelubricants': " + demo.showBug("polygenelubricants"));
        System.out.println("Absolute hashcode of 'GydZG_': " + demo.showBug("GydZG_"));
        System.out.println("Absolute hashcode of 'DESIGNING WORKHOUSES': " + demo.showBug("DESIGNING WORKHOUSES"));
    }
}