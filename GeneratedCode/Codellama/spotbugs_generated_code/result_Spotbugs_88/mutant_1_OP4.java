import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }

    // Mutant #1: Unreachable if-else statement
    public int showBugMutant1(int input) {
        x = input;
        foo();
        if (false) {
            // This code is unreachable, but it needs to be added to avoid compile-time errors
            return 0;
        } else {
            return x;
        }
    }

    // Mutant #2: Unreachable while loop
    public int showBugMutant2(int input) {
        x = input;
        foo();
        while (false) {
            // This code is unreachable, but it needs to be added to avoid compile-time errors
            x = 0;
        }
        return x;
    }

    // Mutant #3: Unreachable for loop
    public int showBugMutant3(int input) {
        x = input;
        foo();
        for (int i = 0; false; i++) {
            // This code is unreachable, but it needs to be added to avoid compile-time errors
            x = 0;
        }
        return x;
    }

    // Mutant #4: Unreachable if-else statement with redundant condition
    public int showBugMutant4(int input) {
        x = input;
        foo();
        if (false && (x == 0)) {
            // This code is unreachable, but it needs to be added to avoid compile-time errors
            return 0;
        } else {
            return x;
        }
    }
}