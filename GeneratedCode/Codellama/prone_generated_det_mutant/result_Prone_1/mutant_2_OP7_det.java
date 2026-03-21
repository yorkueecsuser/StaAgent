import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        boolean bndyhqqr = false;while (bndyhqqr && false && false && false && false && false && true && false && true && false && true && false) {char akqqdogj = 'i';}
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