class InfiniteRecursionBug {
    public void showBug() {
        infiniteRecursion(); // BUG: IL: An apparent infinite recursive loop (IL_INFINITE_RECURSIVE_LOOP)
    }

    private void infiniteRecursion() {
        // Mutation: Unreachable switch statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // This block is unreachable
            int value = getValue();
            switch(value) {
                case 1:
                    System.out.println("Unreachable code");
                    break;
            }
        }
        infiniteRecursion();
    }

    private boolean getCondition() {
        return false; // This always returns false, making the switch statement unreachable
    }

    private int getValue() {
        return 0; // This always returns 0, which does not match any case in the switch statement
    }
}