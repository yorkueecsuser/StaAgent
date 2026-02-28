import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        for(int i = 0; i < 0; i++) {
            System.out.println("This loop is unreachable");
        }
        return index;
    }
}