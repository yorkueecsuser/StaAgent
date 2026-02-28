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

        // Unreachable for loop mutation
        for (int j = 0; false; j++) {
            // Unreachable code
            outputArray[j] = inputArray[j] + 1;
        }

        return outputArray;
    }
}