class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape

        // Mutant Code Addition
        boolean condition = getCondition(); // Makes condition unreachable
        if (condition) {
            System.out.println("This line will never be executed.");
        }
    }

    // A new method to get a condition that is unreachable
    private static boolean getCondition() {
        return false;
    }
}