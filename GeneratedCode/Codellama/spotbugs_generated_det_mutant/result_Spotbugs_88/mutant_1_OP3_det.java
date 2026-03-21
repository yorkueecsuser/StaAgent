import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (false && true && false && true && true && false && false && true && false && true && false) {int fpertlro = 638259527;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}