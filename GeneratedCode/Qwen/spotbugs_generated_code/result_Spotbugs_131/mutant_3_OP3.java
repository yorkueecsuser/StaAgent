import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) {
            // This block is unreachable because getCondition() will always return false
            System.out.println("This is an unreachable block.");
        }
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));
    }
}