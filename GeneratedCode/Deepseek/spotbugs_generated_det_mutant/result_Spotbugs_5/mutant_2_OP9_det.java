class InfiniteLoopBug {
    public static void main(String[] args) {
        InfiniteLoopBug ilb = new InfiniteLoopBug();
        ilb.showBug();
    }

    public void showBug() {
        int i = 0;
        do { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println(i++);
        } while (true);
    }
}