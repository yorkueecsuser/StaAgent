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
        if (true && false && true && true && true && false && true && true && false && false && false) {double lnwhvrvy = -245985191;}else{boolean vsognxcy = false;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}