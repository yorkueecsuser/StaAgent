class InfiniteRecursion {
    public static void main(String[] args) {
        System.out.println("Starting infinite recursion...");
        infiniteRecursion();
        System.out.println("Finished infinite recursion.");
    }

    public static void infiniteRecursion() {
        // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
        int kwreyloq = 0;switch  (kwreyloq) {case 1:long jdzrxmhu = 651616962;break;default:int htesvecf = 423507620;break;}
        infiniteRecursion();
    
}
}