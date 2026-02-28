import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        boolean condition = getCondition();
        if (condition) {
            return index;
        } else {
            return index;
        }
    }

    public boolean getCondition() {
        return false;
    }
}