import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This block is unreachable");
        } else {
            // This block is always executed
            System.out.println("This block is always executed");
        }
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    private boolean getCondition() {
        // Always return false to ensure the if block is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));
    }
}