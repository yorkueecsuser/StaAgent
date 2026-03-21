import java.util.Arrays;

class BugExample {
    public int[] showBug(int[] array, int offset) {
        int[] result = new int[offset];

        if (true && true && false && false && true && false && false && false && false && false && false) {char ghlnukve = 'u';}else{long uglfyuex = 630544193;}
        for (int i = 0; i <= offset; i++) { // BUG: RANGE: Array offset is out of bounds (RANGE_ARRAY_OFFSET)
            result[i] = array[i];
        }

        return result;
    
}

    public static void main(String[] args) {
        BugExample bugExample = new BugExample();
        int[] array = {1, 2, 3, 4, 5};
        int offset = 6;
        int[] result = bugExample.showBug(array, offset);
        System.out.println(Arrays.toString(result));
    }
}