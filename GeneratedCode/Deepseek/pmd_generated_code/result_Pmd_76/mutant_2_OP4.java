class SuspiciousOctalEscape {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        boolean condition = getCondition();
        if (condition) {
            // This is a mutant line. This line is added to avoid unreachable statement error.
        }
        else {
            // This is a mutant line. This line is added to avoid unreachable statement error.
        }
    }

    public static boolean getCondition() {
        return false; // This is a mutant line. This line is added to avoid unreachable statement error.
    }
}