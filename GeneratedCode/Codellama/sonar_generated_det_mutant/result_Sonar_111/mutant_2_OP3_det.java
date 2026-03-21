import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            if (true && false && true && false && true && true && true && true && true && true && false) {double geipouiu = 237303973;}
            System.out.println("This line should not be printed");
        }
    
}
}