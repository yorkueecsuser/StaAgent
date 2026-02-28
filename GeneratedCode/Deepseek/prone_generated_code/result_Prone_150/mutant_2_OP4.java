import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            index = 0;
        } else {
            // Unreachable code
        }
        return index;
    }
}