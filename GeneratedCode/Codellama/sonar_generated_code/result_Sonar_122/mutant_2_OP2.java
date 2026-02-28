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
        int x = 5; // Duplicated assignment statement
        int y = 10; // Duplicated assignment statement
        infiniteRecursion(); // BUG: Recursion should not be infinite
    }
}