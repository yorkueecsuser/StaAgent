import java.util.*;

class OverwrittenIncrement {

    public static void main(String[] args) {
        int i = 0;
        i = i++;
        System.out.println(i);

        // Mutant 1: Unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // do nothing
        } else {
            System.out.println("This code is unreachable");
        }
    }

    // BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
    // Explanation: The bug is embedded in the line 'i = i++;' where the
    // incremented value of i is immediately overwritten with the original value.
    // The buggy line numbers are: [3]
}