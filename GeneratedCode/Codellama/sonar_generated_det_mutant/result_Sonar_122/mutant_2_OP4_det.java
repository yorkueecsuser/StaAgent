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
        if (false && true && false && true && true && false && true && false && true && false && false) {double pgrmjvxn = 697638102;}else{boolean zmrqukwv = true;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}