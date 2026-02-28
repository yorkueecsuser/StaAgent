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

// Renamed user-defined variable 'i' to 'x'
class OverwrittenIncrement {

    public static void main(String[] args) {
        int x = 0;
        x = x++;
        System.out.println(x);
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'x = x++;' where the
    // incremented value of x is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}