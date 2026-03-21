import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            boolean wvqwuttl = false;while (wvqwuttl && false && false && true && false && false && false && false && false && false && false && false) {int attykhtk = 473220813;}
            System.out.println("This line should not be printed");
        }
    
}
}