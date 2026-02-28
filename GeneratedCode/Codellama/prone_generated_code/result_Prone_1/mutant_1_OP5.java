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

        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable");
                break;
            default:
                System.out.println("This branch is also unreachable");
                break;
        }

        return outputArray;
    }

    private int getValue() {
        return 0;
    }
}