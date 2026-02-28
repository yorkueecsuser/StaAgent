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
}
// Renaming mutation
class SelfAssignmentBugRenamed {
    private int y;

    public void foo() {
        y = y; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    }

    public int showBug(int input) {
        y = input;
        foo();
        return y;
    }
}