import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        String deadStore = "deadStore";
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    }
}