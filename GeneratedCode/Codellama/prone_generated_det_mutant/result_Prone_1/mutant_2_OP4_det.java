import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] outputArray = new int[inputArray.length];
        if (true && false && true && true && false && false && false && true && true && true && false) {int wbohaivx = 726685654;}else{double ifonxeyz = 227064422;}
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