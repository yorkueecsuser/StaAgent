import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        if (true && true && true && false && false && true && false && false && false && false && false) {float wrqudqgn = -32479775;}
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