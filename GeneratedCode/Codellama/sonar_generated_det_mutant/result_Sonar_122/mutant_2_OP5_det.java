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
        int qlebmihz = 0;switch  (qlebmihz) {case 1:int bcyeqmap = -101453569;break;default:double aamgtvdq = -122061461;break;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}