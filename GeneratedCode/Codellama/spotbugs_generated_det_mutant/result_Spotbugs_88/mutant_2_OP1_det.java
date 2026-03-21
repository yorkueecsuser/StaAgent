import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        short lmzphmye = -1343;
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}