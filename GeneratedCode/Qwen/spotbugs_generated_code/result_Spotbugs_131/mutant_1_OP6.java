import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) { // Unreachable for loop
            // This loop is unreachable because conditionFor is always false
        }
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)
    }

    private boolean getCondition() {
        return false; // This method returns false, making the for loop unreachable
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));
    }
}