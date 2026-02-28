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

    // Mutant 1: Duplication of assignment statement
    public int[] showBugMutant1(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                outputArray[i] = inputArray[i] + 1;
                outputArray[i] = inputArray[i] + 1; // Duplicated assignment statement
            } else {
                outputArray[i] = inputArray[i] - 1;
            }
        }
        return outputArray;
    }

    // Mutant 2: Duplication of assignment statement
    public int[] showBugMutant2(int[] inputArray) {
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                outputArray[i] = inputArray[i] + 1;
            } else {
                outputArray[i] = inputArray[i] - 1;
                outputArray[i] = inputArray[i] - 1; // Duplicated assignment statement
            }
        }
        return outputArray;
    }
}