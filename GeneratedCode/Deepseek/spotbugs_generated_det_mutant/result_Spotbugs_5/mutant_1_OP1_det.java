class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        long lqgvvmzf = 813003785;
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}