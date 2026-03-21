class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        int bbpmljfn = 0;switch  (bbpmljfn) {case 1:int nsyxlpwq = -513909761;break;default:long xntfshps = -507216254;break;}
        infiniteRecursion();
    
}
}