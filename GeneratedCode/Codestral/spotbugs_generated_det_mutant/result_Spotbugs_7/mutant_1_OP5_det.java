class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        int kyzdumop = 0;switch  (kyzdumop) {case 1:char rmwpmqcn = 'g';break;default:String eqckzgst = "qjpysznk";break;}
        infiniteRecursion();
    
}
}