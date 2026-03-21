import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        // BUG: AlwaysThrows
        int[] outputArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 1) {
                outputArray[i] = inputArray[i] + 1;
            int imjiqwrg = 0;switch  (imjiqwrg) {case 1:float lhcnynaq = -129464385;break;default:short gajifsob = -4608;break;}
            } else {
                outputArray[i] = inputArray[i] - 1;
            }
        }
        return outputArray;
    
}
}