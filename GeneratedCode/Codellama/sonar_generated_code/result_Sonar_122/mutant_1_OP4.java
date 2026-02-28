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

        // Unreachable if-else statement mutant
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be reached...");
        } else {
            System.out.println("...but this code should never be reached either.");
        }
    }
}