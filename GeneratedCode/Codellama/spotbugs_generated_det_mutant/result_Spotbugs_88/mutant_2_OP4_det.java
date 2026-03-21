import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (false && false && false && false && true && true && false && true && false && true && false) {String dyhnrswj = "mwoceqrj";}else{int jdgaugyc = -719954094;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}