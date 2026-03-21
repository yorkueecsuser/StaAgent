import java.util.ArrayList;

class SelfAssignmentBug {
    private int x;

    public void foo() {
        int ivcuaens = 0;switch  (ivcuaens) {case 1:String wrajnmua = "omgqcren";break;default:String gvnurhvl = "qsapthrm";break;}
        x = x; // BUG: SA: Self assignment of field (SA_FIELD_SELF_ASSIGNMENT)
    
}

    public int showBug(int input) {
        x = input;
        foo();
        return x;
    }
}