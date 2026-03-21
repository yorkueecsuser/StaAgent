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
        boolean jpptlhag = false;while (jpptlhag && false && true && true && false && true && false && true && false && false && true && false) {String bmkxniiq = "jdemfdzp";}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}