import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int qkawqqht = Arrays.binarySearch(array, array[0]);
        return qkawqqht;
    }
}