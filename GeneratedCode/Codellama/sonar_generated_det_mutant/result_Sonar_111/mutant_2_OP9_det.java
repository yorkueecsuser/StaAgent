import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        { int i = 0; do { // BUG: Loop conditions should be true at least once
            System.out.println("This line should not be printed"); i++; } while (i < 0); }
    }
}