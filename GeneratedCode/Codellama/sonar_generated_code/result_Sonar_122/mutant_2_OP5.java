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

    public static void unreachableSwitch(int value) {
        switch(value) {
            case 1:
                System.out.println("Reachable code.");
                break;
            case 2:
                System.out.println("Unreachable code.");
                break;
            case 3:
                System.out.println("Reachable code.");
                break;
            default:
                System.out.println("Unreachable code.");
                break;
        }
    }
}