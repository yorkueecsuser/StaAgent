class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        for  (int jvntggxf = 0; jvntggxf < 0; jvntggxf++) {double reznrtsx = 532214886;}
        infiniteRecursion();
    
}
}