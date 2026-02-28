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

    // Mutant 1: Unreachable switch statement
    int value = getValue();
    switch(value) {
        case 1: /* code */ break;
        default: /* default code */ break;
    }

    // Mutant 2: If statement with false condition
    boolean condition = getCondition();
    if (condition) {
        /* code */
    } else {
        /* alternative code */
    }

    // Mutant 3: While loop with false condition
    boolean conditionWhile = getCondition();
    while (conditionWhile) {
        /* code */
    }

    // Mutant 4: For loop with false condition
    boolean conditionFor = getCondition();
    for (int i = 0; conditionFor; i++) {
        /* code */
    }

    // Mutant 5: If-else statement with false condition
    boolean shouldRun = getCondition();
    if (shouldRun) {
        /* code */
    } else {
        /* alternative code */
    }
}

public int getValue() {
    return 1;
}

public boolean getCondition() {
    return false;
}