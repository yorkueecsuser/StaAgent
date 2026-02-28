import java.util.Arrays;

class SelfComparison {
    // BUG: SelfComparison
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        int unreachableValue = 0; 
        switch (unreachableValue) {
            case 1:
                System.out.println("This code is unreachable");
                break;
            default:
                break;
        }
        return index;
    }
}