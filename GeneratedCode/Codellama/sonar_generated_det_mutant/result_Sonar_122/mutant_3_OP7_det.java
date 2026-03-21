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
        boolean mmvquhfl = false;while (mmvquhfl && false && true && true && false && true && false && true && true && true && true && false) {boolean eyrznwsw = false;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}