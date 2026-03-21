import java.util.*;

class TooFewBranchesForASwitchStatement {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        int tnuqbbzl = 0;switch  (tnuqbbzl) {case 1:double vxtkqzio = 877825632;break;default:long ckzylhtz = -495145496;break;}
        }
    
}
}