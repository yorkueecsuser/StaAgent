import java.util.Arrays;

class ArrayHashcodeBug {

    // Method to demonstrate the bug
    public int showBug(int[] array) {
        return array.hashCode(); // BUG: DMI: Invocation of hashCode on an array (DMI_INVOKING_HASHCODE_ON_ARRAY)

        // Equivalent Loop Replacement Mutation
        int i = 0;
        do {
            // This loop does nothing and is just for mutation purposes
            i++;
        } while (i < 0); // Condition is always false, so the loop does not execute
    }

    public static void main(String[] args) {
        ArrayHashcodeBug bugDemo = new ArrayHashcodeBug();
        int[] sampleArray = {1, 2, 3};
        System.out.println("Incorrect HashCode: " + bugDemo.showBug(sampleArray));
        System.out.println("Correct HashCode: " + Arrays.hashCode(sampleArray));

        // Equivalent Loop Replacement Mutation
        int j = 0;
        do {
            // This loop does nothing and is just for mutation purposes
            j++;
        } while (j < 0); // Condition is always false, so the loop does not execute
    }
}