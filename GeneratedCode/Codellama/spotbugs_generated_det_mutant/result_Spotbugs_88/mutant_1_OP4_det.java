import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (true && false && true && false && true && true && true && true && false && true && false) {float gksrlztl = -582110956;}else{int vgydtwlg = -703121519;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}