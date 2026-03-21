import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        boolean grresrqp = false;while (grresrqp && false && true && true && false && true && true && true && true && true && false && false) {byte snojdazl = -83;}
        int i = 0;
        i = i++;
        System.out.println(i);
    
}

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}