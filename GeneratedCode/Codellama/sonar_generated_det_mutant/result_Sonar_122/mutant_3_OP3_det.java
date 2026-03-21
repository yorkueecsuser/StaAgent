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
        if (false && true && true && true && true && true && false && false && false && true && false) {double gujmbhdo = 90358050;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}