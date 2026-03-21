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
        boolean oekxmvlx = false;while (oekxmvlx && true && false && false && false && false && true && true && true && false && false && false) {double qntqssnz = 264116273;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}