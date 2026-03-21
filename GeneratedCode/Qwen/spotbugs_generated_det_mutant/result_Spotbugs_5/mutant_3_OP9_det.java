class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        do { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        } while (i < 10);
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}