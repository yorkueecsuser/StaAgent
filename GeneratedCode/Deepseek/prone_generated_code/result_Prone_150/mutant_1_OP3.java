import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        boolean alwaysFalse = false;
        if (alwaysFalse) {
            int index = Arrays.binarySearch(array, array[0]);
            return index;
        }
        return 0;
    }
}