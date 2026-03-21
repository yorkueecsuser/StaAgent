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
        int iqhytuwu = 0;switch  (iqhytuwu) {case 1:short cqnonsow = -3916;break;default:String jdaohruw = "zoemjqzp";break;}
        infiniteRecursion(); // BUG: Recursion should not be infinite
    
}
}