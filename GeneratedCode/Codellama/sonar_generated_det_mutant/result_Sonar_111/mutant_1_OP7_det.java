import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            boolean zibtxhzh = false;while (zibtxhzh && true && false && false && false && true && true && true && true && true && false && false) {double rwsejwnq = -213406838;}
            System.out.println("This line should not be printed");
        }
    
}
}