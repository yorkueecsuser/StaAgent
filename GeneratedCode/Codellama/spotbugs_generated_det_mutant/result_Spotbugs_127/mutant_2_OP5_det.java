import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        int i = 0;
        int vcgvjyoz = 0;switch  (vcgvjyoz) {case 1:boolean mkqssdlb = false;break;default:short euhymfsx = 4606;break;}
        i = i++;
        System.out.println(i);
    
}

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}