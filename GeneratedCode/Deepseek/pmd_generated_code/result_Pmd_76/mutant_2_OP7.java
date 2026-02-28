class SuspiciousOctalEscape {
    static boolean unreachableLoopCondition = false;

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("suspicious: \128"); // BUG: SuspiciousOctalEscape
        
        // Unreachable while loop mutant
        while (unreachableLoopCondition) {
            System.out.println("This is an unreachable loop!");
        }
    }
}