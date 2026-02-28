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

    // Mutant 1: Unreachable if statement
    if (false) {
        i = i++;
    }

    // Mutant 2: Unreachable while loop
    while (false) {
        i = i++;
    }

    // Mutant 3: Unreachable for loop
    for (int j = 0; false; j++) {
        i = i++;
    }

    // Mutant 4: Unreachable if-else statement
    if (false) {
        i = i++;
    } else {
        System.out.println("This code is unreachable");
    }

    // Mutant 5: Unreachable switch statement
    int value = 0;
    switch (value) {
        case 0:
            i = i++;
            break;
        default:
            System.out.println("This code is unreachable");
            break;
    }
}