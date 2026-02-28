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
    
    // Unreachable switch statement mutant
    public static void infiniteRecursion(int x) {
        switch (x) {
            case 1:
                infiniteRecursion(x);
                break;
            default:
                infiniteRecursion(x);
                break;
        }
    }
}