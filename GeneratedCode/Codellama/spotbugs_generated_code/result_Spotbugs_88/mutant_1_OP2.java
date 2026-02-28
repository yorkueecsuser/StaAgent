import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        x = 10; // Mutant: Duplicate assignment statement
    }

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}