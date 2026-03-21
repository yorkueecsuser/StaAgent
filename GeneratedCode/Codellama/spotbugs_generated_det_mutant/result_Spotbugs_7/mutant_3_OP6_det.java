class InfiniteRecursion {
    public static void main(String[] args) {
        System.out.println("Starting infinite recursion...");
        infiniteRecursion();
        System.out.println("Finished infinite recursion.");
    }

    public static void infiniteRecursion() {
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        for  (int kbidqcau = 0; kbidqcau < 0; kbidqcau++) {String esdqyors = "wokqilla";}
        infiniteRecursion();
    
}
}