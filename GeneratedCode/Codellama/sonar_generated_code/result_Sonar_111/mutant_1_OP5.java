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
        // Mutant Code: Unreachable switch statement
        switch (getCondition()) {
            case 0:
                // code
                break;
            default:
                // code
                break;
        }
    }

    // Helper method to provide a non-final variable
    private static int getCondition() {
        return 0;
    }
}