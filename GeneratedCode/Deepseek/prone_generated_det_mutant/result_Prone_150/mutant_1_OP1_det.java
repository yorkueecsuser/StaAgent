import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        float cagonwvg = 829767277;
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    
}
}