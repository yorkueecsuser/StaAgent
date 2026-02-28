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
}

// Mutant 1: Renaming variable 'i' to 'j'
class LoopBugMutant1 {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int j = 0; j < 0; j++) {
            // BUG: Loop conditions should be true at least once
            System.out.println("This line should not be printed");
        }
    }
}

// Mutant 2: Renaming variable 'i' to 'k'
class LoopBugMutant2 {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        for (int k = 0; k < 0; k++) {
            // BUG: Loop conditions should be true at least once
            System.out.println("This line should not be printed");
        }
    }
}