class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        boolean mlvrbxok = false;while (mlvrbxok && true && true && false && false && true && false && false && true && true && true && false) {long ggmrriyf = 196643136;}
        int i = 0;
        while(true) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        }
    
}
}