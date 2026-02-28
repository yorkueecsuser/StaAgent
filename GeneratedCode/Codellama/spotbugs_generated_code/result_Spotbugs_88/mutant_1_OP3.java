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

    // Mutant code starts here
    public int showBugMutant(int input) {
        if (false) { // Unreachable if statement
            x = 0;
        }
        x = input;
        foo();
        return x;
    }
}