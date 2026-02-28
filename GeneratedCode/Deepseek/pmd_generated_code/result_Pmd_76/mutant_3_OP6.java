class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 10; i++) {
                // Unreachable for loop
            }
        } else {
            System.out.println("This code will never run");
        }
    }

    public static boolean getCondition() {
        return false; // This will make the condition always false
    }
}