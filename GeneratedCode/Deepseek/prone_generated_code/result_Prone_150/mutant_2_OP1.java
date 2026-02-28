import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        String unusedVar = "abcdefgh"; // Added Dead Store mutation
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    }
}