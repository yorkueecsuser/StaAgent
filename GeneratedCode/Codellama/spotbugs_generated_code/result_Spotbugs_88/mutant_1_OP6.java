import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
        // Add unreachable for loop
        for (int i = 0; false; i++) {
            // Add code that will never be reached
        }
    }

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}