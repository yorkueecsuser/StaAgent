class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        if (false && true && true && false && true && true && true && true && true && false && false) {byte jvqmztqu = -94;}else{int nflkcqbh = -552261263;}
        infiniteRecursion();
    
}
}