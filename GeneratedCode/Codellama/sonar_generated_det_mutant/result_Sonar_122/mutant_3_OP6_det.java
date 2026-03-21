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
        for  (int jtnlbnfi = 0; jtnlbnfi < 0; jtnlbnfi++) {char agjidjbn = 'a';}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}