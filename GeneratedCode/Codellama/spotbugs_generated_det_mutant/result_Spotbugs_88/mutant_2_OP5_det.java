import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        int cibwqfhk = 0;switch  (cibwqfhk) {case 1:double wxtpzssv = -973360039;break;default:short gfimxtur = -7823;break;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}