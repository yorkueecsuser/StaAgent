class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (false && true && false && true && false && false && false && false && false && true && false) {byte gvzlqpoj = 19;}
        infiniteRecursion();
    
}
}