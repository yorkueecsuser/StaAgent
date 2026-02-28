class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
        }

        // Mutated code using Equivalent Loop Replacement
        i = 0; // Resetting i to ensure the do-while loop also becomes an infinite loop
        do {
            System.out.println("This loop will also never terminate because the condition is never updated.");
        } while (i < 10);
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}