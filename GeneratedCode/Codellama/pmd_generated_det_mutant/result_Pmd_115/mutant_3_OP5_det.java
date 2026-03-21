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
                int jhadpvot = 0;switch  (jhadpvot) {case 1:char qxouqvmf = 'p';break;default:long jryogbyy = 892914940;break;}
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}