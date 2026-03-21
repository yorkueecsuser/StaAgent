class InfiniteRecursion {
    public static void main(String[] args) {
        System.out.println("Starting infinite recursion...");
        infiniteRecursion();
        System.out.println("Finished infinite recursion.");
    }

    public static void infiniteRecursion() {
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        int ccyaramo = 0;switch  (ccyaramo) {case 1:boolean godpnopc = false;break;default:double alnemtcw = 983138186;break;}
        infiniteRecursion();
    
}
}