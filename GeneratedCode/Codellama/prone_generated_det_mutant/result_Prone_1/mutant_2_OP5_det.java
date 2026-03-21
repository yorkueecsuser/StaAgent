import java.util.*;

class AlwaysThrows {
    public int[] showBug(int[] inputArray) {
        int lkfmpwtf = 0;switch  (lkfmpwtf) {case 1:float wnjbyhtb = -54208756;break;default:boolean juigqnwn = false;break;}
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