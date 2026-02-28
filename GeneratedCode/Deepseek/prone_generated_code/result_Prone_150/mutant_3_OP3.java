import java.util.Arrays;

class SelfComparison {
    // Mutant: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        boolean condition = false;
        if (condition) {
            // Unreachable code
            index = -1;
        }
        return index;
    }
}