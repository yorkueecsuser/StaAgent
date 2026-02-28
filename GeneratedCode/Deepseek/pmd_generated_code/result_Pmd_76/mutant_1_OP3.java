class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // Original Code

        // Mutant Code: Unreachable if statement
        if (false) {
            System.out.println("The value is 128."); // This code will never be executed
        }
    }
}