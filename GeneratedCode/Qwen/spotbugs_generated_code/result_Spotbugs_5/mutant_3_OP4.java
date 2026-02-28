class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");
            
            // Mutant: Inserting an unreachable if-else statement
            boolean shouldRun = getCondition();
            if (shouldRun) {
                System.out.println("This is reachable code.");
            } else {
                System.out.println("This is unreachable code due to the condition always being false.");
            }
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}