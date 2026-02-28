import java.util.ArrayList;

class LoopBug {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int i = 0; i < 0; i++) {
            // BUG: Loop conditions should be true at least once
            System.out.println("This line should not be printed");
        }

        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This line should not be printed");
        } else {
            System.out.println("This line should be printed");
        }
    }
}