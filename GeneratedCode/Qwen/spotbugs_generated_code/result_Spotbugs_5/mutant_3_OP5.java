class InfiniteLoopExample {

    public void showBug() {
        int i = 0;
        while (i < 10) { // BUG: IL: An apparent infinite loop (IL_INFINITE_LOOP)
            System.out.println("This loop will never terminate because the condition is never updated.");

            // Mutated code: Inserting an unreachable switch statement
            boolean alwaysFalse = getAlwaysFalse();
            switch (alwaysFalse) {
                case true:
                    System.out.println("This is unreachable code.");
                    break;
            }
        }
    }

    private boolean getAlwaysFalse() {
        return false;
    }

    public static void main(String[] args) {
        InfiniteLoopExample example = new InfiniteLoopExample();
        example.showBug();
    }
}