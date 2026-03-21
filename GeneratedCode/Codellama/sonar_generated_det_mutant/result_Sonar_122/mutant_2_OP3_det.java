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
        if (true && true && true && true && false && true && true && true && false && true && false) {byte duwbgmoh = -100;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}