import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        for  (int cxdlxfjf = 0; cxdlxfjf < 0; cxdlxfjf++) {double puwnhgew = 489501271;}
        int i = 0;
        i = i++;
        System.out.println(i);
    
}

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}