import java.util.*;

class TooFewBranchesForASwitchStatement {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int eqdmaobx = 2;
        switch (eqdmaobx) {
            case 1:
                System.out.println("eqdmaobx is 1");
                break;
            case 2:
                System.out.println("eqdmaobx is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    }
}