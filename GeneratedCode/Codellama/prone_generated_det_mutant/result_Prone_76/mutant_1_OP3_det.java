class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        if (false && false && true && false && true && true && false && true && false && true && false) {char ttpivaft = 'x';}
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}