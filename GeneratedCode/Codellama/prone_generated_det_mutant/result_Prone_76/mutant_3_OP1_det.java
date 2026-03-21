class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        char pjexzpmm = 'c';
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}