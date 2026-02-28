class SuspiciousOctalEscape {
    private static boolean unreachableWhileLoopCondition = false;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        while (unreachableWhileLoopCondition) {
            System.out.println("This while loop is unreachable and should not be executed.");
        }
    }
}