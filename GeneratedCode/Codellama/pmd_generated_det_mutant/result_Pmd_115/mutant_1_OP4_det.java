import java.util.*;

class TooFewBranchesForASwitchStatement {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        if (true && true && false && false && false && false && false && false && false && false && false) {int ymhvvmuo = 939777378;}else{double jgdbkqbp = -434932811;}
        int x = 2;
        switch (x) {
            case 1:
                System.out.println("x is 1");
                break;
            case 2:
                System.out.println("x is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}