import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] a) {
        Arrays.sort(a);
        int b = Arrays.binarySearch(a, a[0]);
        return b;
    }
}