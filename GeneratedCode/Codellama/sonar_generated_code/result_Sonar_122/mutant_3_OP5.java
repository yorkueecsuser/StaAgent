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
    public static void unreachableSwitchStatement() {
        int value = 0;
        switch (value) {
            case 1:
                System.out.println("This branch is unreachable.");
                break;
            default:
                System.out.println("This branch is reachable.");
                break;
        }
    }
}