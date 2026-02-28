class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \\128"); // BUG: SuspiciousOctalEscape

        // Mutant code.
        boolean condition = getCondition(); 
        if (condition) {
            // Unreachable code
            System.out.println("This code is unreachable");
        } else {
            // Reachable code
            System.out.println("This code is reachable");
        }
    }

    // Helper method to get a condition
    private static boolean getCondition() {
        return false;
    }
}