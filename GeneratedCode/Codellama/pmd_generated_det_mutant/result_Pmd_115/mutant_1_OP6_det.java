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
            for  (int koqcpdbt = 0; koqcpdbt < 0; koqcpdbt++) {char hgkmyzkk = 'd';}
            case 2:
                System.out.println("x is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}