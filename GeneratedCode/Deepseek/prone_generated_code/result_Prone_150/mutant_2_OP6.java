import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        boolean unreachableCondition = false;
        for(int i = 0; false; i++) {
            // Unreachable Code
        }
        return index;
    }
}