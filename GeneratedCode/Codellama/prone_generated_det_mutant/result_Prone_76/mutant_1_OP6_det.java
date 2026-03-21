class InfiniteRecursion {
    public static void main(String[] args) {
        for  (int owdmojam = 0; owdmojam < 0; owdmojam++) {byte ltbgvysk = -120;}
        // BUG: InfiniteRecursion
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}