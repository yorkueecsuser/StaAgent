import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            int index = Arrays.binarySearch(array, array[0]);
            return index;
        } else {
            return -1;
        }
    }

    public boolean getUnreachableCondition() {
        return false;
    }
}