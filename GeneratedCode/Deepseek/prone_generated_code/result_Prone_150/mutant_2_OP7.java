import java.util.Arrays;

class SelfComparison {
    public int showBug(int[] array) {
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, array[0]);
        return index;
    }
}

class MutatedCode {
    public void mutate() {
        SelfComparison selfComparison = new SelfComparison();
        while (false) {
            int[] array = {1, 2, 3, 4, 5};
            int index = selfComparison.showBug(array);
            if (index == -1) {
                break;
            }
        }
    }
}