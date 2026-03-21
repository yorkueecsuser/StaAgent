import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        short nqiasezd = 2018;
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}