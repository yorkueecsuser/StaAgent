import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        boolean klcdqrwr = false;while (klcdqrwr && false && true && true && true && false && true && true && true && false && false && false) {float vslczqqr = 163837192;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}