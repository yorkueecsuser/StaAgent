import java.util.Arrays;

class BugExample {
    public int[] showBug(int[] array, int offset) {
        int[] result = new int[offset];

        int pdpjjubf = 0;switch  (pdpjjubf) {case 1:int lwwghllp = 800723945;break;default:String gdzpzvjn = "flaxaahu";break;}
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