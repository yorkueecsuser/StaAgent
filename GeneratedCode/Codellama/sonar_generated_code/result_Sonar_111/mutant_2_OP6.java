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

        // Unreachable for loop
        for (int i = 0; i < 0; i++) {
            // This loop will be unreachable due to the condition being always false
            System.out.println("This line should not be printed");
        }
    }
}