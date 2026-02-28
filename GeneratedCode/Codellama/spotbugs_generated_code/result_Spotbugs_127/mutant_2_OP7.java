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

    // Mutant 1: Unreachable while loop
    // Description: Inserting unreachable while loop into a randomly selected basic block in the program. The condition of the inserted loop is always false to make it unreachable.
    // Line number: [3]
    while (false) {
        // Do nothing
    }

    // Mutant 2: Unreachable if statement
    // Description: Inserting unreachable if statement into a randomly selected basic block in the program. The condition of the inserted if statement is always false to make it unreachable.
    // Line number: [3]
    if (false) {
        // Do nothing
    }

    // Mutant 3: Unreachable for loop
    // Description: Inserting unreachable for loop into a randomly selected basic block in the program. The condition of the inserted for loop is always false to make it unreachable.
    // Line number: [3]
    for (int i = 0; false; i++) {
        // Do nothing
    }

    // Mutant 4: Unreachable switch statement
    // Description: Inserting unreachable switch statement into a randomly selected basic block in the program. The switch expression is always false to make it unreachable.
    // Line number: [3]
    switch (false) {
        case false:
            // Do nothing
            break;
        default:
            break;
    }
}