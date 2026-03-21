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
        if (false && true && false && true && false && true && true && false && true && false && false) {boolean lnmnljnk = true;}else{byte tzihvonx = -48;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}