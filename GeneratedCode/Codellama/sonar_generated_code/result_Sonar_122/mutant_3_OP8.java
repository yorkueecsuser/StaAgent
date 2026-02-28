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
        recursion(); // Mutation: Renamed variable from infiniteRecursion() to recursion()
    }
}