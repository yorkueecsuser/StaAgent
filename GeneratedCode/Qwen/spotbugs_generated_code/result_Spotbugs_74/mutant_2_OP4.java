import java.util.Arrays;

class ArrayComparisonBug {

    public boolean showBug(int[] array, String nonArray) {
        // BUG: EC: equals() used to compare array and nonarray (EC_ARRAY_AND_NONARRAY)
        return array.equals(nonArray);

        // Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This is an unreachable if block.");
        } else {
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // This method returns a condition that is always false, ensuring the if-else block is unreachable
        return false;
    }

    public static void main(String[] args) {
        ArrayComparisonBug bugDemo = new ArrayComparisonBug();
        int[] sampleArray = {1, 2, 3};
        String sampleString = "123";
        System.out.println("Result of buggy comparison: " + bugDemo.showBug(sampleArray, sampleString));
    }
}