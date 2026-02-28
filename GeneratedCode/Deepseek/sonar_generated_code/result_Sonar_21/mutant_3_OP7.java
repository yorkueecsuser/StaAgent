class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }
    }
}

// Mutant Code starts here:
class Mutant {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int value = -1;
        if (value < 0) {
            throw new IllegalArgumentException("Value cannot be negative");
        }

        // Unreachable while loop mutant code
        boolean condition = false;
        while (condition) {
            System.out.println("This is an unreachable while loop");
        }
    }
}