import java.util.Arrays;

class BugExample {
    public int[] showBug(int[] array, int offset) {
        int[] bbkplizf = new int[offset];

        for (int i = 0; i <= offset; i++) { // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
            bbkplizf[i] = array[i];
        }

        return bbkplizf;
    }

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        int offset = 6;
        int[] result = bugExample.showBug(array, offset);
        System.out.println(Arrays.toString(result));
    }
}