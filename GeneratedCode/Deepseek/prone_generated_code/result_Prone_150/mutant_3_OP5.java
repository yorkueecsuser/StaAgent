import java.util.Arrays;

class SelfComparison {
    private boolean condition = false; // Unreachable switch statement
    private boolean conditionWhile = false; // Unreachable while loop
    private boolean conditionFor = false; // Unreachable for loop
    private boolean shouldRun = false; // Unreachable if-else statement
    private int value = 0; // Unreachable switch statement

    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    }
}