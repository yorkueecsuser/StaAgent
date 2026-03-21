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
            if (false && true && true && false && true && true && true && false && true && false && false) {short hjqewyax = 4814;}else{String neaxiwju = "rqylfwuq";}
            case 2:
                System.out.println("x is 2");
                break;
            // BUG: TooFewBranchesForASwitchStatement
        }
    
}
}