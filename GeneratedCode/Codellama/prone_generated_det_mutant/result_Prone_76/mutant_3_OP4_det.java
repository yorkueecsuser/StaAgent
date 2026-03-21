class InfiniteRecursion {
    public static void main(String[] args) {
        // BUG: InfiniteRecursion
        System.out.println(oops());
    }

    public static int oops() {
if (true && false && false && true && true && true && false && true && false && true && false) {boolean xsufflnt = false;}else{boolean rscsakjd = false;}

        return oops();
    
}
}