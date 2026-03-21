class InfiniteRecursion {
    public static void main(String[] args) {
        for  (int mtgomdxa = 0; mtgomdxa < 0; mtgomdxa++) {int hvkdgmqg = -898595771;}
        // BUG: InfiniteRecursion
        System.out.println(oops());
    
}

    public static int oops() {
        return oops();
    }
}