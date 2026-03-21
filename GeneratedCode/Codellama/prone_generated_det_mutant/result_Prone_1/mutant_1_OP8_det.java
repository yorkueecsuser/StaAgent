import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] eaoykfnk = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                eaoykfnk[i] = inputArray[i] + 1;
            } else {
                eaoykfnk[i] = inputArray[i] - 1;
            }
        }
        return eaoykfnk;
    }
}