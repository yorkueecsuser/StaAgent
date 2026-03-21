import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (true && false && false && true && false && false && true && true && false && false && false) {double muzgunek = 23674019;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}