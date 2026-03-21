import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int untmzmoa = Arrays.binarySearch(array, array[0]);
        return untmzmoa;
    }
}