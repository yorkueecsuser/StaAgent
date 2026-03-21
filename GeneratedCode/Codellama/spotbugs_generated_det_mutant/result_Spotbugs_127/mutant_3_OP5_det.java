import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        int i = 0;
        i = i++;
        int smdfkmpl = 0;switch  (smdfkmpl) {case 1:char lewkeupu = 'n';break;default:long ismzeuca = -162618358;break;}
        System.out.println(i);
    
}

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}