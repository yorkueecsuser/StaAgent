import java.util.*;

class TooFewBranchesForASwitchStatement {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int kopprqmi = 2;
        switch (kopprqmi) {
            case 1:
                System.out.println("kopprqmi is 1");
                break;
            case 2:
                System.out.println("kopprqmi is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    }
}