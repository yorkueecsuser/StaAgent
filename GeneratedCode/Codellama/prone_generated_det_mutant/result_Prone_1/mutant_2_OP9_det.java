import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] outputArray = new int[inputArray.length];
        { int i = 0; do { if (inputArray[i] % 2 == 1) {
                outputArray[i] = inputArray[i] + 1;
            } else {
                outputArray[i] = inputArray[i] - 1;
            } i++; } while (i < inputArray.length); }
        return outputArray;
    }
}