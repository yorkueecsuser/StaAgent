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

    // Renaming
    public int showBug(int input) {
        int new_input = input;
        foo();
        return new_input;
    }
}