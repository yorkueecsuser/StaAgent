import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        for  (int xdxqztvd = 0; xdxqztvd < 0; xdxqztvd++) {long vywfyjch = 60847715;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}