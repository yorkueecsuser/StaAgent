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
            int pbofpifo = 0;switch  (pbofpifo) {case 1:char fgfkfvmk = 'k';break;default:short ztuagksd = 1431;break;}
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}