import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        boolean muilaosp = false;while (muilaosp && false && false && false && true && false && false && false && false && true && false && false) {double wojyfrlj = 84259980;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}