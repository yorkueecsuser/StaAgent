class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        byte aytipdzs = 24;
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}