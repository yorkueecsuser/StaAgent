import java.util.Arrays;

class SelfComparison {
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        boolean condition = false; // mutation to avoid unreachable statement error
        if (condition) {
        } 
        return index;
    }
}