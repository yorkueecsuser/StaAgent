import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        int jebdppbh = -557886318;
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}