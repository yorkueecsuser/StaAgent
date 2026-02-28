class InfiniteRecursion {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.out.println("Starting infinite recursion...");
        infiniteRecursion();
        System.out.println("Recursion finished.");
    }

    public static void infiniteRecursion() {
        System.out.println("Infinite recursion occurred.");
        infiniteRecursion(); // BUG: Recursion should not be infinite
    }

    // Unreachable if statement mutant
    public static boolean getCondition() {
        return false;
    }

    // Mutated Java code
    public static void infiniteRecursion() {
        System.out.println("Infinite recursion occurred.");
        if (getCondition()) {
            infiniteRecursion(); // Unreachable if branch
        }
    }
}