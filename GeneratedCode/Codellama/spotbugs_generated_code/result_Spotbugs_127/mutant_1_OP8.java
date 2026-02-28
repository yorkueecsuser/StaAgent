import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}

// Renaming user-defined variable
class OverwrittenIncrement {

    public static void main(String[] args) {
        int j = 0;
        j = j++;
        System.out.println(j);
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'j = j++;' where the
    // incremented value of j is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}