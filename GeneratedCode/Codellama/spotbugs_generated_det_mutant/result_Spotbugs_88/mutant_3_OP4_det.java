import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        if (true && false && true && true && true && true && false && false && false && false && false) {long epcwvzpj = 393093300;}else{double yxokxxcx = 240708023;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}