import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            if (false && false && true && true && true && true && false && true && false && true && false) {String rcoaqyhp = "dlleejfy";}else{short zmrqhqdf = 677;}
            System.out.println("This line should not be printed");
        }
    
}
}