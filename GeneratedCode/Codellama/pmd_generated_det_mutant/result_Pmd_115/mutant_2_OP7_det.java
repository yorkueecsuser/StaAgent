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
            boolean zlmtrbtp = false;while (zlmtrbtp && true && true && false && false && true && true && false && true && false && true && false) {short ghhihjtk = -9106;}
            case 2:
                System.out.println("x is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}