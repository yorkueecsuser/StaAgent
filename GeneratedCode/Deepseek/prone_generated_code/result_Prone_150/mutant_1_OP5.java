import java.util.Arrays;

class SelfComparison {
    boolean condition = false; // This control variable will ensure that our switch statement is unreachable

    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        int value = 0; // This is the switch statement, it is unreachable because the condition (condition) is always false
        switch(value) {
            default:
                break;
        }
        return index;
    }
}