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
        int jmtboicw = 0;switch  (jmtboicw) {case 1:byte xqvqgnpx = 71;break;default:double zqcjbvdc = -491350627;break;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}