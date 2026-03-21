class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        System.out.println(oops());
    }

    public static int oops() {
if (true && true && true && false && true && true && true && true && true && true && false) {byte jqrvqcdp = 126;}

        return oops();
    
}
}