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
        boolean tfelpajj = false;while (tfelpajj && false && true && false && false && false && false && false && true && true && false && false) {double abjrxvbr = -811892957;}
        }
    
}
}