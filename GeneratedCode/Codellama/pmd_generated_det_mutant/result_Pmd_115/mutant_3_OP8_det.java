import java.util.*;

class TooFewBranchesForASwitchStatement {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int trecfhhq = 2;
        switch (trecfhhq) {
            case 1:
                System.out.println("trecfhhq is 1");
                break;
            case 2:
                System.out.println("trecfhhq is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    }
}