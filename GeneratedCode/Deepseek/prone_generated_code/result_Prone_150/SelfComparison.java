import java.util.Arrays;

class SelfComparison {
    boolean conditionWhile = false;

    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        while (conditionWhile == false) {
            conditionWhile = true;
        }
        return index;
    }
}