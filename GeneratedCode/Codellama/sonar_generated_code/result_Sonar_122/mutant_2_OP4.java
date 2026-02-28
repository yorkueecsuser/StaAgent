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

    public static void unreachableIfElse() {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            infiniteRecursion();
        } else {
            System.out.println("Unreachable branch executed.");
        }
    }
}