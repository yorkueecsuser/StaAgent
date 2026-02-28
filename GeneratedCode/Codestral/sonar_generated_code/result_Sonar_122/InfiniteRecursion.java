class InfiniteRecursion {
    public int showBug(int n) {
        // BUG: Recursion should not be infinite
        return showBug(n + 1);
    }
    public static void main(String[] args) {
        InfiniteRecursion ir = new InfiniteRecursion();
        System.out.println(ir.showBug(1));
    }
}