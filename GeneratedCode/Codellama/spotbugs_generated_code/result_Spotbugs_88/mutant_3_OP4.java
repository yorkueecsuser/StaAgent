import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        if (false) {
            x = 0;
        }
    }

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}