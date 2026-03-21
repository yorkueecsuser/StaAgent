class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        int qsavnvgq = 0;switch  (qsavnvgq) {case 1:char ssupvmjw = 'u';break;default:int eiiiyrsw = 398308624;break;}
        infiniteRecursion();
    
}
}