class InfiniteRecursionBug {

    public int showBug() {
        return recurse(1);
    }

    private int recurse(int n) {
        return recurse(n + 1); // BUG: Recursion should not be infinite
    }
}