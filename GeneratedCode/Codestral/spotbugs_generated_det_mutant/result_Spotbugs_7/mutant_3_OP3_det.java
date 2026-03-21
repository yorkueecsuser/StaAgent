class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (true && false && true && false && false && false && true && false && true && false && false) {int bwklvmyt = 746056939;}
        infiniteRecursion();
    
}
}