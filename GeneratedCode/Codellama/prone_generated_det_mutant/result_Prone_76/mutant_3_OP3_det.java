class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        System.out.println(oops());
    }

    public static int oops() {
if (true && true && true && true && true && false && false && false && true && true && false) {char tefsnyfs = 'w';}

        return oops();
    
}
}