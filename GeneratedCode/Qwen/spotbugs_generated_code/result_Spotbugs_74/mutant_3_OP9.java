import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY) 
        return array.equals(nonArray);

        // Equivalent Loop Replacement: No existing loops to replace, so we introduce a dummy loop for demonstration
        int i = 0;
        do {
            // Dummy operation to maintain the structure
            i++;
        } while (i < 0); // This condition ensures the loop does not execute and does not interfere with the original code
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] sampleArray = {1, 2, 3};
        String sampleString = "123";
        System.out.println("Result of buggy comparison: " + bugDemo.showBug(sampleArray, sampleString));

        // Equivalent Loop Replacement: No existing loops to replace, so we introduce a dummy loop for demonstration
        int j = 0;
        do {
            // Dummy operation to maintain the structure
            j++;
        } while (j < 0); // This condition ensures the loop does not execute and does not interfere with the original code
    }
}