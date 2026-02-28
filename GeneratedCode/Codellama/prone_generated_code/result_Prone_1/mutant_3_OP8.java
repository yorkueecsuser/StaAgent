import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                outputArray[i] = inputArray[i] + 1;
            } else {
                outputArray[i] = inputArray[i] - 1;
            }
        }
        return outputArray;
    }
}

// Generated mutated code for Renaming
class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] outputArray = new int[inputArray.length];
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j] % 2 == 1) {
                outputArray[j] = inputArray[j] + 1;
            } else {
                outputArray[j] = inputArray[j] - 1;
            }
        }
        return outputArray;
    }
}