import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (false && false && true && false && false && false && true && true && false && false && false) {float qfnxzydd = 441857664;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}