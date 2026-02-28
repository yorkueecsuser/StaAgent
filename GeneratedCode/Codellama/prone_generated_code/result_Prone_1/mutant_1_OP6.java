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

    // Unreachable for loop
    public void unreachableForLoop() {
        int i = 0;
        for (; false; i++) {
            // Unreachable statement
            System.out.println("This statement is unreachable");
        }
    }
}