import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        return array.equals(nonArray);

        // Equivalent Loop Replacement: Since there are no loops in the original code,
        // we will introduce a dummy loop and then replace it with an equivalent do-while loop.
        // This is just to demonstrate the mutation operator as per the instructions.

        boolean dummyLoopResult = false;
        int i = 0;
        while (i < 0) { // This loop will never execute because the condition is false.
            dummyLoopResult = true;
            i++;
        }

        boolean dummyDoWhileResult = false;
        i = 0;
        do {
            dummyDoWhileResult = true;
            i++;
        } while (i < 0); // This do-while loop will also never execute for the same reason.

        // The above loops are just for demonstration and do not affect the original bug.
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] sampleArray = {1, 2, 3};
        String sampleString = "123";
        System.out.println("Result of buggy comparison: " + bugDemo.showBug(sampleArray, sampleString));
    }
}