import java.util.*;

class OverwrittenIncrement {
    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);
        for (int j = 0; false; j++) {
            // Unreachable for loop
            // This code will never be executed
            System.out.println("This is an unreachable statement.");
        }
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}