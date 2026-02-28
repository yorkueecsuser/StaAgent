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
    }

    public static void unreachableSwitchStatement() {
        // Unreachable switch statement
        switch (0) {
            case 1:
                System.out.println("Unreachable case");
                break;
            default:
                System.out.println("Unreachable default");
                break;
        }
    }
}