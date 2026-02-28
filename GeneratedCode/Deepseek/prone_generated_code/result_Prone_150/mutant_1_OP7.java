import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        while (false) {
            System.out.println("This is a mutant - Unreachable while loop");
        }
        return index;
    }
}